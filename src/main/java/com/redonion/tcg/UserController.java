package com.redonion.tcg;
import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.redonion.tcg.model.Card;
import com.redonion.tcg.model.User;
import com.redonion.tcg.repository.CardRepository;
import com.redonion.tcg.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/inventory")
    public String userInventory(Model model, Principal principal) {
        String username = principal.getName();
        User user = userRepository.findByUsername(username);

        List<Card> userCards = cardRepository.findByIdUser(user.getIdUser().intValue());
        model.addAttribute("cards", userCards);
        return "user/inventory";
    }
}