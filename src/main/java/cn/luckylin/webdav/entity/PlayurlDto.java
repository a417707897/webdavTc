package cn.luckylin.webdav.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class PlayurlDto {


    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"from":"local","result":"suee","message":"","quality":80,"format":"flv","timelength":37586,"accept_format":"hdflv2,flv,flv720,flv480,mp4","accept_description":["高清 1080P+","高清 1080P","高清 720P","清晰 480P","流畅 360P"],"accept_quality":[112,80,64,32,16],"video_codecid":7,"seek_param":"start","seek_type":"offset","durl":[{"order":1,"length":37586,"size":7611009,"ahead":"","vhead":"","url":"https://upos-sz-mirrorcoso1.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=coso1bv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=b959b80c27e08ee78d13b5cc9d9cd65e&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=0,3&agrr=1&bw=205702&logo=80000000","backup_url":["https://upos-sz-mirrorcos.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=cosbv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=7f228aee683bb84d74423a8acf10651b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=1,3&agrr=1&bw=205702&logo=40000000","https://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=cosbbv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=b0418e9afd9c173b0db4314be57319c7&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=2,3&agrr=1&bw=205702&logo=40000000"]}],"support_formats":[{"quality":112,"format":"hdflv2","new_description":"1080P 高码率","display_desc":"1080P","superscript":"高码率","codecs":null},{"quality":80,"format":"flv","new_description":"1080P 高清","display_desc":"1080P","superscript":"","codecs":null},{"quality":64,"format":"flv720","new_description":"720P 高清","display_desc":"720P","superscript":"","codecs":null},{"quality":32,"format":"flv480","new_description":"480P 清晰","display_desc":"480P","superscript":"","codecs":null},{"quality":16,"format":"mp4","new_description":"360P 流畅","display_desc":"360P","superscript":"","codecs":null}],"high_format":null,"last_play_time":10000}
     */

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ttl")
    private Integer ttl;
    @JsonProperty("data")
    private DataDTO data;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        /**
         * from : local
         * result : suee
         * message :
         * quality : 80
         * format : flv
         * timelength : 37586
         * accept_format : hdflv2,flv,flv720,flv480,mp4
         * accept_description : ["高清 1080P+","高清 1080P","高清 720P","清晰 480P","流畅 360P"]
         * accept_quality : [112,80,64,32,16]
         * video_codecid : 7
         * seek_param : start
         * seek_type : offset
         * durl : [{"order":1,"length":37586,"size":7611009,"ahead":"","vhead":"","url":"https://upos-sz-mirrorcoso1.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=coso1bv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=b959b80c27e08ee78d13b5cc9d9cd65e&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=0,3&agrr=1&bw=205702&logo=80000000","backup_url":["https://upos-sz-mirrorcos.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=cosbv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=7f228aee683bb84d74423a8acf10651b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=1,3&agrr=1&bw=205702&logo=40000000","https://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=cosbbv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=b0418e9afd9c173b0db4314be57319c7&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=2,3&agrr=1&bw=205702&logo=40000000"]}]
         * support_formats : [{"quality":112,"format":"hdflv2","new_description":"1080P 高码率","display_desc":"1080P","superscript":"高码率","codecs":null},{"quality":80,"format":"flv","new_description":"1080P 高清","display_desc":"1080P","superscript":"","codecs":null},{"quality":64,"format":"flv720","new_description":"720P 高清","display_desc":"720P","superscript":"","codecs":null},{"quality":32,"format":"flv480","new_description":"480P 清晰","display_desc":"480P","superscript":"","codecs":null},{"quality":16,"format":"mp4","new_description":"360P 流畅","display_desc":"360P","superscript":"","codecs":null}]
         * high_format : null
         * last_play_time : 10000
         */

        @JsonProperty("from")
        private String from;
        @JsonProperty("result")
        private String result;
        @JsonProperty("message")
        private String message;
        @JsonProperty("quality")
        private Integer quality;
        @JsonProperty("format")
        private String format;
        @JsonProperty("timelength")
        private Integer timelength;
        @JsonProperty("accept_format")
        private String acceptFormat;
        @JsonProperty("video_codecid")
        private Integer videoCodecid;
        @JsonProperty("seek_param")
        private String seekParam;
        @JsonProperty("seek_type")
        private String seekType;
        @JsonProperty("high_format")
        private Object highFormat;
        @JsonProperty("last_play_time")
        private Integer lastPlayTime;
        @JsonProperty("accept_description")
        private List<String> acceptDescription;
        @JsonProperty("accept_quality")
        private List<Integer> acceptQuality;
        @JsonProperty("durl")
        private List<DurlDTO> durl;
        @JsonProperty("support_formats")
        private List<SupportFormatsDTO> supportFormats;

        @NoArgsConstructor
        @Data
        public static class DurlDTO {
            /**
             * order : 1
             * length : 37586
             * size : 7611009
             * ahead :
             * vhead :
             * url : https://upos-sz-mirrorcoso1.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=coso1bv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=b959b80c27e08ee78d13b5cc9d9cd65e&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=0,3&agrr=1&bw=205702&logo=80000000
             * backup_url : ["https://upos-sz-mirrorcos.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=cosbv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=7f228aee683bb84d74423a8acf10651b&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=1,3&agrr=1&bw=205702&logo=40000000","https://upos-sz-mirrorcosb.bilivideo.com/upgcxcode/39/58/789915839/789915839_nb3-1-80.flv?e=ig8euxZM2rNcNbNVhbdVhwdlhbdghwdVhoNvNC8BqJIzNbfqXBvEqxTEto8BTrNvN0GvT90W5JZMkX_YN0MvXg8gNEV4NC8xNEV4N03eN0B5tZlqNxTEto8BTrNvNeZVuJ10Kj_g2UB02J0mN0B5tZlqNCNEto8BTrNvNC7MTX502C8f2jmMQJ6mqF2fka1mqx6gqj0eN0B599M=&uipk=5&nbs=1&deadline=1660852684&gen=playurlv2&os=cosbbv&oi=1988435372&trid=0f292ff6b2384bfd9b4278aa07fb2cc6u&mid=25139097&platform=pc&upsig=b0418e9afd9c173b0db4314be57319c7&uparams=e,uipk,nbs,deadline,gen,os,oi,trid,mid,platform&bvc=vod&nettype=0&orderid=2,3&agrr=1&bw=205702&logo=40000000"]
             */

            @JsonProperty("order")
            private Integer order;
            @JsonProperty("length")
            private Integer length;
            @JsonProperty("size")
            private Integer size;
            @JsonProperty("ahead")
            private String ahead;
            @JsonProperty("vhead")
            private String vhead;
            @JsonProperty("url")
            private String url;
            @JsonProperty("backup_url")
            private List<String> backupUrl;
        }

        @NoArgsConstructor
        @Data
        public static class SupportFormatsDTO {
            /**
             * quality : 112
             * format : hdflv2
             * new_description : 1080P 高码率
             * display_desc : 1080P
             * superscript : 高码率
             * codecs : null
             */

            @JsonProperty("quality")
            private Integer quality;
            @JsonProperty("format")
            private String format;
            @JsonProperty("new_description")
            private String newDescription;
            @JsonProperty("display_desc")
            private String displayDesc;
            @JsonProperty("superscript")
            private String superscript;
            @JsonProperty("codecs")
            private Object codecs;
        }
    }
}
