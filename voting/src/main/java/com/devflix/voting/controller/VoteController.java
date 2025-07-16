// package com.devflix.voting.controller;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/vote")
// public class VoteController {
//   @PostMapping
//   public String vote(@RequestBody Map<String,String> body) {
//     // persist vote
//     return "OK";
//   }
// }

package com.devflix.voting.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/vote")
public class VoteController {

    @PostMapping
    public String vote(@RequestBody Map<String, String> body) {
        // process vote
        return "OK";
    }
}