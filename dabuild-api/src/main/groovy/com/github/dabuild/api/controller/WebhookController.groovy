package com.github.dabuild.api.controller

import org.eclipse.egit.github.core.event.PushPayload
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController("/payload")
class WebhookController {

    @RequestMapping(headers = "X-GitHub-Event=push")
    @ResponseBody
    public String pushEvent(@RequestBody PushPayload push) {
        System.out.println(push)

        "OK"
    }

}
