package com.github.dabuild.api.controller

import org.eclipse.egit.github.core.event.PushPayload
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class WebhookController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path="/payload", headers = "X-GitHub-Event=push")
    @ResponseBody
    public String pushEvent(@RequestBody PushPayload push) {
        System.out.println(push)

        //def object = restTemplate.getForObject("http://repository/vc", String.class)

        //System.out.println(object)

        return "TEST"
    }

}
