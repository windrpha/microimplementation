package com.hcl.flightoperationsapi;

import com.hcl.flightoperationsapi.domain.Flight;
import com.hcl.flightoperationsapi.service.ConsumeAPI;
import org.apache.http.HttpEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ConsumeAPITest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ConsumeAPI consumeAPI;

    @Test(expected = NullPointerException.class)
    public void consumeDeltaApiTest(){

        List<Flight> flight = new ArrayList<>();
        flight.add(new Flight());
        //define the entity you want the exchange to return
        ResponseEntity myEntity = new ResponseEntity<>(flight, HttpStatus.ACCEPTED);

        Mockito.when(restTemplate.exchange(
                Matchers.anyString(),
                Matchers.any(HttpMethod.class),
                (org.springframework.http.HttpEntity<?>) Matchers.<HttpEntity> any(),
                Matchers.<Class<Object>> any())).thenReturn(myEntity);

        List<Flight> res = consumeAPI.consumeAmericanApi();
        Assert.assertEquals(myEntity, res.get(0));


    }

}
