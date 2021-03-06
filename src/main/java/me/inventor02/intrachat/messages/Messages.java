package me.inventor02.intrachat.messages;

import me.inventor02.intrachat.utils.C;

public class Messages {
    public static class Info {
        public static final Message ABOUT_PLUGIN = new Message("About", C.GRAY + C.BOLD + "IntraChat" + C.GRAY + " by inventor02. Uses shawlaf's CommandAPI (under the MIT license): https://github.com/shawlaf/CommandAPI");
        public static final Message LICENSE = new Message("License", C.GRAY + "Copyright (C) 2017 George Peppard" +
                "\n\n" +
                C.GRAY + "This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.\n\n" +
                "This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.\n\n" +
                "You should have received a copy of the GNU General Public License along with this program.  If not, see <http://www.gnu.org/licenses/>.");
    }
}
