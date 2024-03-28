package com.kh.spring10.dto;

import lombok.Data;

@Data
public class ItemDto {
    public int itemNo;
    public String itemName;
    public int itemPrice;
    public int itemCharge;
}