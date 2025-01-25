package com.laiszig.abstractfactory.osFactory.uifactory;

import com.laiszig.abstractfactory.osFactory.Button;
import com.laiszig.abstractfactory.osFactory.Checkbox;

public interface UIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
