package com.project.gameVal.random.seed.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentSeedStateResponseDTO {

    private byte[] secondFromLastNaiveSeed;

    private byte[] currentHashedSeed;
}
