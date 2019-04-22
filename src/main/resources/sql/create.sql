CREATE TABLE IMAGE (
  id  SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  format VARCHAR(10) NOT NULL,
  size INT NOT NULL,
  creation TIMESTAMP NOT NULL,
  last_modification TIMESTAMP NOT NULL,
  data BLOB NOT NULL
);

CREATE TABLE TAG (
  id SERIAL PRIMARY KEY,
  tag VARCHAR(255) NOT NULL
);

CREATE TABLE IMAGE_TAG_MAP (
  image_fk INT NOT NULL,
  tag_fk INT NOT NULL,
  CONSTRAINT map_id PRIMARY KEY(image_fk, tag_fk),
  FOREIGN KEY(image_fk) REFERENCES IMAGE(id) ON DELETE CASCADE,
  FOREIGN KEY(tag_fk) REFERENCES TAG(id) ON DELETE CASCADE
);

CREATE TABLE SLIDESHOW (
  id  SERIAL PRIMARY KEY,
  name  VARCHAR(255) NOT NULL,
  size INT NOT NULL,
  speed FLOAT
);

CREATE TABLE SLIDESHOW_IMAGE_MAP (
  slideshow_fk INT NOT NULL,
  image_fk INT NOT NULL,
  CONSTRAINT map_id PRIMARY KEY(slideshow_fk, image_fk),
  FOREIGN KEY(slideshow_fk) REFERENCES SLIDESHOW(id) ON DELETE CASCADE,
  FOREIGN KEY(image_fk) REFERENCES IMAGE(id) ON DELETE CASCADE
);