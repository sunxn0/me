package com.me.preschoolme.preschool;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PreschoolService {
    private final PreschoolMapper mapper;
}
