package SADYz.backend.client.dto;

import SADYz.backend.client.domain.Client;
import SADYz.backend.client.domain.Status;
import SADYz.backend.conversation.domain.Conversation;
import SADYz.backend.emergency.domain.Emergency;
import SADYz.backend.client.domain.LastMovedTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ClientDto {

  private Long id;
  private String loginId;
  private String name;
  private String address;
  private String birth;
  private String phonenumber;
  private boolean response;
  private boolean stay;
  private Status status;

  private List<Conversation> conversations;

  private List<Emergency> emergency;

  private LastMovedTime lastMovedTime;

  private String imageUrl;

  public Client toEntity(){
    Client build = Client.builder()
        .loginId(loginId)
        .name(name)
        .address(address)
        .birth(birth)
        .phonenumber(phonenumber)
        .response(response)
        .stay(stay)
        .status(status)
        .conversations(conversations)
        .emergency(emergency)
        .lastMovedTime(lastMovedTime)
        .imageUrl(imageUrl)
        .build();
    return build;
  }
}