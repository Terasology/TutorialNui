// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.tutorialnui.widgets;

import org.terasology.engine.rendering.nui.CoreScreenLayer;
import org.terasology.nui.widgets.UIList;

import java.util.ArrayList;
import java.util.List;

public class UIListScreen extends CoreScreenLayer {

    @Override
    public void initialise() {
        UIList dropdown = find("List", UIList.class);
        List<String> options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");
        dropdown.setList(options);
    }
}
