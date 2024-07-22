package com.example.REST_API_CRUD_IMPLEMENTATION.controller;

import com.example.REST_API_CRUD_IMPLEMENTATION.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(String vendorId){

        return cloudVendor;
        //CloudVendor("I1","name1","Add1", "xxxxx");

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;

        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor = cloudVendor;

        return "Cloud Vendor Updated Successfully";
    }


    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){

        this.cloudVendor = null;

        return "Cloud Vendor Deleted Successfully";
    }


}
