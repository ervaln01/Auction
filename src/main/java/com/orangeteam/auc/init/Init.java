package com.orangeteam.auc.init;

import com.orangeteam.auc.models.*;
import com.orangeteam.auc.rep.*;

public class Init {

    public void initAttributes(AttributeRepository attributeRepository){
        Attribute a1 = new Attribute("Вес", "Вес");
        Attribute a2 = new Attribute("Ширина", "Ширина");
        Attribute a3 = new Attribute("Длина", "Длина");
        Attribute a4 = new Attribute("Высота", "Высота");
        Attribute a5 = new Attribute("Материал", "Материал");
        Attribute a6 = new Attribute("Техника", "Техника исполнения");
        Attribute a7 = new Attribute("Автор", "Автор");
        attributeRepository.save(a1);
        attributeRepository.save(a2);
        attributeRepository.save(a3);
        attributeRepository.save(a4);
        attributeRepository.save(a5);
        attributeRepository.save(a6);
        attributeRepository.save(a7);
    }
}
