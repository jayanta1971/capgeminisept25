package com.rbt.springsecv2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rbt.springsecv2.entity.UserEntity;
import com.rbt.springsecv2.repo.UserEntityRepo;
import com.rbt.springsecv2.service.CustomUserService;

import static org.mockito.Mockito.when;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class) // Enables Mockito annotations with JUnit 5
public class MyServiceTest {

    @Mock
    private UserEntityRepo userEntityRepo; // Mock the dependency

    @InjectMocks
    private CustomUserService customUserService; // Inject mocks into the service under test

    @Test
    void testGetData() {
        // Stub the behavior of the mocked repository
        when(userEntityRepo.findById(1)).thenReturn(Optional.of(new UserEntity("jayanta1","Pass")));

        // Call the method on the service under test
        
        UserEntity result = customUserService.getData(1);
        System.out.println(result);
        UserEntity u= new UserEntity("jayanta","Pass");
        System.out.println(u);
        // Assert the expected outcome
        assertThat(u).usingRecursiveComparison()
        .ignoringExpectedNullFields()
        .isEqualTo(result);
    }
}
