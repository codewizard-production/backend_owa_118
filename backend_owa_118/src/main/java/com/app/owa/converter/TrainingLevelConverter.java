package com.app.owa.converter;

import com.app.owa.enums.TrainingLevel;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class TrainingLevelConverter implements AttributeConverter<TrainingLevel, Integer> {

    @Override
    public Integer convertToDatabaseColumn(TrainingLevel trainingLevel) {
        return trainingLevel != null ? trainingLevel.ordinal() : null;
    }

    @Override
    public TrainingLevel convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return TrainingLevel.getTrainingLevel(dbData);
    }
}
