package com.grpc.movie.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@ToString
public class Movie {
    @Id
    private int id;
    private String title;
    private int year;
    private double rating;
    private String genre;
}
//tét
// commit thử này
// nếu chưa ai commit vào cái branch đấy thì mình chuwua cần pull code về
//muốn push chỉ cần commit rồi púh
//hhhh