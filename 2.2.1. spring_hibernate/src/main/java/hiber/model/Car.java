package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    //@OneToOne(mappedBy = "car", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@OneToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "user_id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "car")
    User user;

    public Car () {}

    public Car (String model, int series) {
        this.model = model;
        this.series = series;
    }
}
