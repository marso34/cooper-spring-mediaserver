package com.whisper.coopermedia.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "media_channels")
@Entity
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MediaChannel extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // db가 id를 자동 생성하게
    private Long id;
    private Long workspaceId;
    private String channelName;
    private int userCount;
}
