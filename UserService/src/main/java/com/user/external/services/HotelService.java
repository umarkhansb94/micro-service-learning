package com.user.external.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.entites.Hotel;

@FeignClient(name = "HOTEL-SERVICE-MS")
public interface HotelService {
	
	@GetMapping("/hotels/{hotelId}")
	public Hotel getHotel(@PathVariable String hotelId);

}
