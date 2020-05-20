/*
 * Copyright 2018, Stefan Uebe
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.vaadin.stefan.fullcalendar;

import elemental.json.JsonObject;

/**
 * Extended entry event type, that provides also additional client side entry data, that can be interpreted on the
 * server side.
 */
public abstract class EntryDataEvent extends EntryEvent {

    private final JsonObject jsonObject;

    /**
     * New instance. Awaits the changed data object.
     * @param source source component
     * @param fromClient is from client
     * @param jsonObject json object with changed data
     */
    public EntryDataEvent(FullCalendar source, boolean fromClient, JsonObject jsonObject) {
        super(source, fromClient, jsonObject.getString("id"));
        this.jsonObject = jsonObject;
    }

    /**
     * Returns the json object that contains the changes from client side.
     *
     * @return changes as JsonObject
     */
    public JsonObject getJsonObject() {
        return jsonObject;
    }
}
