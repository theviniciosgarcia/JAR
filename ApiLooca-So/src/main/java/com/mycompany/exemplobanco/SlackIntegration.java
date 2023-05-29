package com.mycompany.exemplobanco;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

public class SlackIntegration {
    
    private static String webHookurl = "https://hooks.slack.com/services/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";
    private static String oAuthToken = "xoxb-5244459468339-5345222179121-D4cHLTJfY5Jcmj8XSuqysY9R";
    private static String slackChannel = "alertas-tecnico-infinitysolutions";
    
    public void enviaMensagemSlack(String mensagem){
        try{
        StringBuilder msgbuilder = new StringBuilder();
        msgbuilder.append(mensagem);
        
        Payload payload = Payload.builder().channel(slackChannel).text(msgbuilder.toString()).build();
        
        WebhookResponse wbResp = Slack.getInstance().send(webHookurl, payload);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}