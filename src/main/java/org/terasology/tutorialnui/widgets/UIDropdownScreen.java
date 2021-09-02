// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.tutorialnui.widgets;

import org.terasology.engine.rendering.nui.CoreScreenLayer;
import org.terasology.nui.widgets.UIDropdown;

import java.util.ArrayList;
import java.util.List;

public class UIDropdownScreen extends CoreScreenLayer {

    @Override
    public void initialise() {
        UIDropdown dropdown = find("Dropdown", UIDropdown.class);
        List<String> options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");
        dropdown.setOptions(options);
    }
}
