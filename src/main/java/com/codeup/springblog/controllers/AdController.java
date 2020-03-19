package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.codeup.springblog.repositories.AdRepo;

import java.util.List;

@Controller
public class AdController {
    private final AdRepo adDao;

    public AdController(AdRepo adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    @ResponseBody
    public List<Ad> getAllAds() {
        return adDao.findAll();
    }


//    @GetMapping("/ads/save")
//    @ResponseBody
//    public String saveAd(){
//        Ad newAd = new Ad();
//        newAd.setTitle("New Ad");
//        newAd.setDescription("This is a newly save ad!");
//        adDao.save(newAd);
//        return "Saving ad";
//    }
//
//    @GetMapping("/ads/update")
//    @ResponseBody
//    public String updateAd() {
//        AD ad = adDao.getOne(1l);
//        ad.setTitle("Updated Title!");
//        adDao.save(ad);
//        return "Updating ad";
//    }
}

