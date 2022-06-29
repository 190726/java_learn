package com.sk.jpa.started.ch04;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
//@Entity
@Table(name="BOARD")
@SecondaryTables({
		@SecondaryTable(name="BOARD_DETAIL", pkJoinColumns = @PrimaryKeyJoinColumn(name="BOARD_DETAIL_ID"))
		//@SecondaryTable(name="BOARD_FILE", pkJoinColumns = @PrimaryKeyJoinColumn(name="BOARD_FILE_ID"))
})
public class Board {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	@Column(table = "BOARD_DETAIL")
	private String content;
	
	@ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(
            name = "BOARD_FILE",
            joinColumns = @JoinColumn(name = "BOARD_FILE_ID")
    )
    @OrderColumn(name = "IDX")
	private List<BoardFile> boardFiles = new ArrayList<>();

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setBoardFiles(List<BoardFile> boardFiles) {
		this.boardFiles = boardFiles;
	}
}