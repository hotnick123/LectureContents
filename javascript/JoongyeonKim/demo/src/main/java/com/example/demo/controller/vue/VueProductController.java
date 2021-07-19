package com.example.demo.controller.vue;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/vueproduct")
public class VueProductController {
    @Autowired
    private ProductService productservice;

    @GetMapping("/productregister")
    public String getProduct (Product product, Model model) throws Exception {
        log.info("getProduct(): " + productservice.productlist());

        model.addAttribute("productlists", productservice.productlist());

        return "/board/fifth/product/productregister";
    }

    @PostMapping("/productregister")
    public String postProduct (Product product, Model model) throws Exception {
        log.info("postProduct()");
        log.info("Product: " + product);

        productservice.productregister(product);

        model.addAttribute("pdt", "등록이 완료되었습니다!");

        return "/board/fifth/product/success";
    }

    @GetMapping("/productlist")
    public String getProductlist (Model model) throws Exception {
        log.info("getProductlist(): " + productservice.productlist());

        model.addAttribute("product", productservice.productlist());

        return "/board/fifth/product/productlist";
    }

    @GetMapping("/productread")
    public String getProductRead (int productNo, Model model) throws Exception{
        log.info("productread(): productNo = " + productNo);

        model.addAttribute(productservice.productread(productNo));

        return "/product/productread";
    }
}
