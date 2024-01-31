package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.EbazaarReportsData;
import com.example.entity.Product;
import com.example.helper.Helper;
import com.example.service.EbazaarReportsDataService;
import com.example.service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private EbazaarReportsDataService ebazaarReportsDataService;
    
    @PostMapping("/product/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            //true

            this.productService.save(file);

            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));


        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
    }


    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return this.productService.getAllProducts();
    }
    
    
// ##############################################  
    
    
    @PostMapping("/ebazaarReportsData/upload")
    public ResponseEntity<?> ebazaarReportsDataUpload(@RequestParam("file") MultipartFile file) {
        if (Helper.checkExcelFormat(file)) {
            //true

            this.ebazaarReportsDataService.save(file);

            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to Database"));


        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
    }


    @GetMapping("/getEbazaarReportsData")
    public List<EbazaarReportsData> getEbazaarReportsData() {
        return this.ebazaarReportsDataService.getEbazaarReportsData();
    }

}
