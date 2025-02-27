package org.mvnsearch.infrastructure;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.jooq.Record;
import org.jooq.jpa.extensions.DefaultAnnotatedPojoMemberProvider;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class InfraConfiguration {
  @Bean
  public Jackson2ObjectMapperBuilderCustomizer jooqRecord() {
    return builder -> builder.serializationInclusion(JsonInclude.Include.NON_NULL)
      .serializers(new StdSerializer<Record>(Record.class) {
        @Override
        public void serialize(Record value, JsonGenerator gen, SerializerProvider provider) throws IOException {
          gen.writeObject(value.intoMap());
        }
      });
  }

  @Bean
  public DefaultConfigurationCustomizer jooqJPAConfiguration() {
    return configuration -> configuration.setAnnotatedPojoMemberProvider(new DefaultAnnotatedPojoMemberProvider());
  }

}
