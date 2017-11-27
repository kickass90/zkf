package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2017 济中节能 All rights reserved.
 * Created by LiLei on 2017/8/9 14:34.
 */
@Configuration
@ComponentScan(basePackages = {"com.jet.zkf.job","com.jet.zkf.service","com.jet.zkf.mysql"})
public class Application {
}
