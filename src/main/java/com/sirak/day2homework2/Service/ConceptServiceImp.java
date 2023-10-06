package com.sirak.day2homework2.Service;

import com.sirak.day2homework2.Model.Concept;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
@Service
public class ConceptServiceImp implements ConceptService {


    @Override
    public List<Concept> getConcept() {
        Concept conceptList1= new Concept("Sirak",18,"Malcome x", "fight for rights");
        Concept conceptList2= new Concept("Bacha",17,"Sinderla", "About Love");
        return Arrays.asList(conceptList1,conceptList2);

    }
}
