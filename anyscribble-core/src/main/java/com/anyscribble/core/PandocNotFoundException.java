/**
 * AnyScribble Core - Writing for Developers by Developers
 * Copyright © 2016 Thomas Biesaart (thomas.biesaart@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.anyscribble.core;

/**
 * This exception is generally thrown if the pandoc installation was not found on the current machine.
 *
 * @author Thomas Biesaart
 */
public class PandocNotFoundException extends IllegalStateException {
    public PandocNotFoundException() {
        super(
                "Pandoc was not found on the current system. " +
                        "Make sure you either set the '" + Configuration.PANDOC_BIN_KEY + "` system property or add" +
                        "pandoc to your PATH variable"
        );
    }
}
