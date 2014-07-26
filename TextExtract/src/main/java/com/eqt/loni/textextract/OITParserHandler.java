package com.eqt.loni.textextract;

import java.io.IOException;
import java.nio.CharBuffer;

import net.bitform.api.elements.*;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

class OITParserHandler extends BaseElementHandler {

		private ContentHandler handler;
		
		public OITParserHandler(ContentHandler handler) {
			this.handler = handler;
		}
	
		@Override
		public void endAdded(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endAddedCell(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endAnnot(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endArchiveColInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endArchiveColumnDefinitions(Element element)
				throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endArchiveRow(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endArchiveTable(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endArchiveTableName(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endArticleThread(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endAuthorHistory(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endBody(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endBoolean(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endBooleanCell(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endBooleanField(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endBooleanProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endCell(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endChart(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endCodepageProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endColInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endCollection(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endCommentingAuthor(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endContent(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endContentRef(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDataCell(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDataField(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDataProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseColInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseColumnDefinitions(Element element)
				throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseFieldName(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseQueries(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseRow(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseTable(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDatabaseTableName(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDate(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDateField(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDateProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDeleted(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDeletedCell(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDocumentCollection(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endDurationProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endEmbeddedContent(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endException(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endExportDocument(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endExtremeCells(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endFastSaveData(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endFingerprint(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endFloatProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endFormField(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endFrame(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endHeaderFooter(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endHeaderFooterRef(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endHidden(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endHyperlinkBegin(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endHyperlinkEnd(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endInteger(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endIntegerProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endL(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endLinkedContent(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endListProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endLocaleProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endLocationInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endMacrosAndCode(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endNote(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endNoteRef(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endObfuscated(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endOfficeXMLPart(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endOutlineItem(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endP(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endPT(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endPage(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endPageInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endPrinterInformation(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endProcessingInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endRevisions(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endRoot(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endRoutingSlip(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endRow(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endRowInfo(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endScenario(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSection(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSecureResult(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSheet(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSheetName(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSlide(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSlideBody(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSlideTitle(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endString(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endStringProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSubContent(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSurvey(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endSurveyQuestion(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTable(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTemplate(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endText(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTextBox(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTextCell(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTextField(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTextProperty(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endThumbnail(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endTrace(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endVersions(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endWeakProtections(Element element) throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void endWebCaptureContentSet(Element element)
				throws IOException {
			try {
				element.toSaxEnd(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}
		}

		@Override
		public void startAdded(AddedElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startAddedCell(AddedCellElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startAnnot(AnnotElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startArchiveColInfo(ArchiveColInfoElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startArchiveColumnDefinitions(
				ArchiveColumnDefinitionsElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startArchiveRow(ArchiveRowElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startArchiveTable(ArchiveTableElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startArchiveTableName(ArchiveTableNameElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startArticleThread(ArticleThreadElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startAuthorHistory(AuthorHistoryElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startBody(BodyElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startBoolean(BooleanElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startBooleanCell(BooleanCellElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startBooleanField(BooleanFieldElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startBooleanProperty(BooleanPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startCell(CellElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startChart(ChartElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startCodepageProperty(CodepagePropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startColInfo(ColInfoElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startCollection(CollectionElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startCommentingAuthor(CommentingAuthorElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startContent(ContentElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startContentRef(ContentRefElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDataCell(DataCellElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDataField(DataFieldElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDataProperty(DataPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseColInfo(DatabaseColInfoElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseColumnDefinitions(
				DatabaseColumnDefinitionsElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseFieldName(DatabaseFieldNameElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseQueries(DatabaseQueriesElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseRow(DatabaseRowElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseTable(DatabaseTableElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDatabaseTableName(DatabaseTableNameElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDate(DateElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDateField(DateFieldElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDateProperty(DatePropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDeleted(DeletedElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDeletedCell(DeletedCellElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDocumentCollection(DocumentCollectionElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startDurationProperty(DurationPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startEmbeddedContent(EmbeddedContentElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startException(ExceptionElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startExportDocument(ExportDocumentElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startExtremeCells(ExtremeCellsElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startFastSaveData(FastSaveDataElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startFingerprint(FingerprintElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startFloatProperty(FloatPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startFormField(FormFieldElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startFrame(FrameElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startHeaderFooter(HeaderFooterElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startHeaderFooterRef(HeaderFooterRefElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startHidden(HiddenElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startHyperlinkBegin(HyperlinkBeginElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startHyperlinkEnd(HyperlinkEndElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startInteger(IntegerElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startIntegerProperty(IntegerPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startL(LElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startLinkedContent(LinkedContentElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startListProperty(ListPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startLocaleProperty(LocalePropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startLocationInfo(LocationInfoElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startMacrosAndCode(MacrosAndCodeElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startNote(NoteElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startNoteRef(NoteRefElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startObfuscated(ObfuscatedElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startOfficeXMLPart(OfficeXMLPartElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startOutlineItem(OutlineItemElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startP(PElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startPT(PTElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startPage(PageElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startPageInfo(PageInfoElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startPrinterInformation(PrinterInformationElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startProcessingInfo(ProcessingInfoElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startRevisions(RevisionsElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startRoot(RootElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startRoutingSlip(RoutingSlipElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startRow(RowElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startRowInfo(RowInfoElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startScenario(ScenarioElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSection(SectionElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSecureResult(SecureResultElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSheet(SheetElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSheetName(SheetNameElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSlide(SlideElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSlideBody(SlideBodyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSlideTitle(SlideTitleElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startString(StringElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startStringProperty(StringPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSubContent(SubContentElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSurvey(SurveyElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startSurveyQuestion(SurveyQuestionElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTable(TableElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTemplate(TemplateElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startText(TextElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTextBox(TextBoxElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTextCell(TextCellElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTextField(TextFieldElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTextProperty(TextPropertyElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startThumbnail(ThumbnailElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startTrace(TraceElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startVersions(VersionsElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startWeakProtections(WeakProtectionsElement element)
				throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}

		}

		@Override
		public void startWebCaptureContentSet(
				WebCaptureContentSetElement element) throws IOException {
			try {
				element.toSaxStart(handler);
			} catch (SAXException e) {
				throw new ElementHandlerException(e);
			}
		}

		@Override
		public void text(CharBuffer arg0) throws IOException {
			try {
				if(arg0.hasArray()) {
					handler.characters(arg0.array(), arg0.arrayOffset(), arg0.remaining());
					handler.characters("\n".toCharArray(), 0, 1);
				} else {
					char buf[] = new char[1024];
					while(arg0.hasRemaining()) {
						int length = Math.min(buf.length, arg0.remaining());
						arg0.get(buf, 0, length);
						handler.characters(buf, 0, length);
					}
					buf[0] = '\n';
					handler.characters(buf, 0, 1);
				}
			} catch(SAXException e) {
				throw new ElementHandlerException(e);
			}
		}

  }
