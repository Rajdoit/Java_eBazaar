package com.example.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.EbazaarReportsData;
import com.example.helper.Helper;
import com.example.repo.EbazaarReportsDataRepo;

@Service
public class EbazaarReportsDataService {

    @Autowired
    private EbazaarReportsDataRepo ebazaarReportsDataRepo;

    public void save(MultipartFile file) {

        try {
            List<EbazaarReportsData> ebazaarReportsDataList = Helper.convertExcelToList(file.getInputStream());
            this.ebazaarReportsDataRepo.saveAll(ebazaarReportsDataList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<EbazaarReportsData> getEbazaarReportsData() {
        return this.ebazaarReportsDataRepo.findAll();
    }


}
