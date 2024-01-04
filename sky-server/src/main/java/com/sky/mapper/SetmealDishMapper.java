package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    //select * from setmeal_dish where dish_id = #{id}
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

}
