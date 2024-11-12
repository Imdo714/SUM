package com.swyp.peach.Stduy.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GithubProfile {

    private String email;
    private String name;
    @JsonProperty("avatar_url")
    private String imageUrl;
    private String blog;
}
