// Copyright 2020 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.tutorialnui.widgets;

import org.terasology.engine.rendering.nui.CoreScreenLayer;
import org.terasology.nui.widgets.UIDropdownScrollable;

import java.util.ArrayList;
import java.util.List;

public class UIDropdownScrollableScreen extends CoreScreenLayer {

    @Override
    public void initialise() {
        UIDropdownScrollable dropdown = find("Dropdown", UIDropdownScrollable.class);
        List<String> options = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            options.add("Option " + i);
        dropdown.setOptions(options);
    }
}
