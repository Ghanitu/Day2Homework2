package com.sirak.day2homework2.Controller;
import com.sirak.day2homework2.Service.ConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.sirak.day2homework2.Model.Concept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/concept")


public class ConceptController {


  @Autowired
  private ConceptService conceptService;

    public ConceptController(ConceptService conceptService) {

    }


    @GetMapping("/get")

    public String getconcept(Model model) {
        model.addAttribute("concepts",conceptService.getConcept());
        return "concepts";
    }
         @GetMapping("/getConcepts")
       public String getConceptById(@RequestParam(required = false, name="conceptId")int id, Model model){
        model.addAttribute("concept", Concept.builder()
                .name("Sirak")
                .id(id)
                .title("Malcome")
                .descrption( "about fighting rights")
                .build());
        return "concept";

       }




@GetMapping("{id}")
    public String getconcept(@PathVariable int id, Model model){
       model.addAttribute("concept", Concept.builder()
               .name("Bacha")
               .id(id)
               .title("Snderela")
               .descrption("About Love")
               .build());
       return "concept";

    }
    @GetMapping("/{concId}/comment/{cid}")
    public String getConceptCommentBtCocIdAndCommentId(@PathVariable int proId,@PathVariable int cid, Model model){
        model.addAttribute("concept", Concept.builder()
                .name("Sir")
                .id(proId)
                .title(String.valueOf(cid))
                .descrption("Happy Man")
                .build());
                return "concept";
    }
    @PostMapping("/save")
    public String saveProd(){
        return "saveProduct";
    }
}


