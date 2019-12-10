package com.orangeteam.auc.init;

import com.orangeteam.auc.models.*;
import com.orangeteam.auc.rep.*;

public class Init {

    public void initAttributes(AttributeRepository attributeRepository){
        Attribute a1 = new Attribute("Вес", 0);
        Attribute a2 = new Attribute("Ширина", 0);
        Attribute a3 = new Attribute("Длина", 0);
        Attribute a4 = new Attribute("Высота", 0);
        Attribute a5 = new Attribute("Материал", 1);
        Attribute a6 = new Attribute("Техника", 1);
        Attribute a7 = new Attribute("Автор", 1);
        attributeRepository.save(a1);
        attributeRepository.save(a2);
        attributeRepository.save(a3);
        attributeRepository.save(a4);
        attributeRepository.save(a5);
        attributeRepository.save(a6);
        attributeRepository.save(a7);
    }
}
