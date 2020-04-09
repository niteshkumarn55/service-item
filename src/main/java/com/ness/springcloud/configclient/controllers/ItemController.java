package com.ness.springcloud.configclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
public class ItemController {

    @Value("${item: Default Item 01}")
    private String item;

    @GetMapping(value = "/items")
    public String getItem(){
        return item;
    }

    @PostMapping(value = "/item/add")
    public String addItem(){
        return "Item added";
    }

    @PutMapping(value = "/item/modified")
    public String updateItem(){
        return "Modidied";
    }

    @DeleteMapping(value = "/item/delete/{id}")
    public String deleteItem(@PathVariable("id")Long id){
        return "Deleted item with Id::"+id;
    }
}
