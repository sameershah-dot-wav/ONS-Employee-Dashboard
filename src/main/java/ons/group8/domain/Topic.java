package ons.group8.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="topic")
public class Topic {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    @ManyToOne
    @JoinColumn(name="checklist_template_id")
    private ChecklistTemplate checklistTemplate;
    @Column(name="topic_name")
    private String name;
    @Column(name="description")
    private String description;

    public Topic(ChecklistTemplate checklistTemplate, String name, String description) {
        this.checklistTemplate = checklistTemplate;
        this.name = name;
        this.description = description;
    }
}
