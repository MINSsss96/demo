package com.example.demo.controller;

import com.example.demo.dto.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller


public class TestController {
    @GetMapping({"main", "/"})
    public String mainPage() {
        return "main";
    }


    @GetMapping("/gugu")
    public String printGugu(Model model) {
        List<Integer> danList = Arrays.asList(2, 3, 9);
        List<Integer> numList = IntStream.rangeClosed(1, 9).boxed().collect(Collectors.toList());

        model.addAttribute("danList", danList);
        model.addAttribute("numList", numList);
        return "/gugudan/gugu";
    }

    @GetMapping("/itemlist")
    public String viewItemList(Model model) {
        List<ItemDTO> itemDTOList = new ArrayList<>(
        Arrays.asList(
                new ItemDTO("테스트상품1", "상품 상세 설명1", 1000, LocalDateTime.now()),
                new ItemDTO("테스트상품2", "상품 상세 설명2", 2000, LocalDateTime.now()),
                new ItemDTO("테스트상품3", "상품 상세 설명3", 3000, LocalDateTime.now()),
                new ItemDTO("테스트상품4", "상품 상세 설명4", 4000, LocalDateTime.now()),
                new ItemDTO("테스트상품5", "상품 상세 설명5", 5000, LocalDateTime.now()),
                new ItemDTO("테스트상품6", "상품 상세 설명6", 6000, LocalDateTime.now()),
                new ItemDTO("테스트상품7", "상품 상세 설명", 7000, LocalDateTime.now()),
                new ItemDTO("테스트상품8", "상품 상세 설명", 8000, LocalDateTime.now()),
                new ItemDTO("테스트상품9", "상품 상세 설명", 9000, LocalDateTime.now()),
                new ItemDTO("테스트상품10", "상품 상세 설명", 10000, LocalDateTime.now())
        )
        );
        model.addAttribute("items", itemDTOList);
        return "/itemList/itemList";
    }
}
