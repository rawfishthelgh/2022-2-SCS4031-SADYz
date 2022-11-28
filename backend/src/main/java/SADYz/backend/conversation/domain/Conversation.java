package SADYz.backend.conversation.domain;

import SADYz.backend.client.domain.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Conversation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String fullText;

  private String problem;

  private String emotion;

  @ManyToOne
  @JoinColumn(name = "client_id")
  @JsonIgnore
  private Client client;

  @Builder
  public Conversation(long id, String fullText, String problem, String emotion, Client client) {
    this.id = id;
    this.fullText = fullText;
    this.problem = problem;
    this.emotion = emotion;
    this.client = client;
  }
}
