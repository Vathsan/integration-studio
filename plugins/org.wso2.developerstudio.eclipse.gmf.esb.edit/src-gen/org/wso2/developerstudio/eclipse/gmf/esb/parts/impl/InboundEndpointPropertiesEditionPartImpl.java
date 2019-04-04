/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.EsbViewsRepository;
import org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart;

import org.wso2.developerstudio.eclipse.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class InboundEndpointPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InboundEndpointPropertiesEditionPart {

	protected Text description;
	protected Text commentsList;
	protected Button editCommentsList;
	protected EList commentsListList;
	protected Text name;
	protected EMFComboViewer type;
	protected Text class_;
	protected Text protocol;
	protected EMFComboViewer inboundEndpointBehaviour;
	protected Text inboundHttpPort;
	protected Text inboundWorkerPoolSizeCore;
	protected Text inboundWorkerPoolSizeMax;
	protected Text inboundWorkerThreadKeepAliveSec;
	protected Text inboundWorkerPoolQueueLength;
	protected Text inboundThreadGroupId;
	protected Text inboundThreadId;
	protected Text dispatchFilterPattern;
	protected Text interval;
	protected Button sequential;
	protected Button coordination;
	protected Text transportVFSFileURI;
	protected Text wso2mbConnectionUrl;
	protected Text transportVFSContentType;
	protected Text transportVFSFileNamePattern;
	protected Text transportVFSFileProcessInterval;
	protected Text transportVFSFileProcessCount;
	protected EMFComboViewer transportVFSLocking;
	protected Text transportVFSMaxRetryCount;
	protected Text transportVFSMoveAfterFailedMove;
	protected Text transportVFSReconnectTimeout;
	protected Button transportJMSSharedSubscription;
	protected Text transportJMSSubscriptionName;
	protected Text transportJMSPinnedServers;
	protected EMFComboViewer transportVFSActionAfterProcess;
	protected Text transportVFSMoveAfterProcess;
	protected EMFComboViewer transportVFSActionAfterErrors;
	protected Text transportVFSMoveAfterErrors;
	protected Text transportVFSFailedRecordsFileName;
	protected Text transportVFSFailedRecordsFileDestination;
	protected Text transportVFSMoveFailedRecordTimestampFormat;
	protected Text transportVFSFailedRecordNextRetryDuration;
	protected EMFComboViewer transportVFSActionAfterFailure;
	protected Text transportVFSMoveAfterFailure;
	protected Text transportVFSReplyFileURI;
	protected Text transportVFSReplyFileName;
	protected Button transportVFSAutoLockRelease;
	protected Text transportVFSAutoLockReleaseInterval;
	protected Button transportVFSLockReleaseSameNode;
	protected Button transportVFSDistributedLock;
	protected Button transportVFSStreaming;
	protected Button transportVFSBuild;
	protected Text transportVFSDistributedTimeout;
	protected Text javaNamingFactoryInitial;
	protected Text javaNamingProviderUrl;
	protected Text transportJMSConnectionFactoryJNDIName;
	protected EMFComboViewer transportJMSConnectionFactoryType;
	protected Text transportJMSConcurrentConsumers;
	protected Text transportJMSDestination;
	protected Button transportJMSSessionTransacted;
	protected EMFComboViewer transportJMSSessionAcknowledgement;
	protected EMFComboViewer transportJMSCacheLevel;
	protected Text transportJMSUserName;
	protected Text transportJMSPassword;
	protected Text transportJMSJMSSpecVersion;
	protected Text transportJMSSubscriptionDurable;
	protected Text transportJMSDurableSubscriberClientID;
	protected Text transportJMSMessageSelector;
	protected Text transportJMSRetryDuration;
	protected Text transportVFSMoveTimestampFormat;
	protected EMFComboViewer transportVFSFileSortAttribute;
	protected Button transportVFSFileSortAscending;
	protected Text transportVFSSubFolderTimestampFormat;
	protected Button transportVFSCreateFolder;
	protected Text transportJMSReceiveTimeout;
	protected Text transportJMSContentType;
	protected Text transportJMSContentTypeProperty;
	protected Text transportJMSReplyDestination;
	protected Text transportJMSPubSubNoLocal;
	protected Text transportJMSDurableSubscriberName;
	protected EMFComboViewer transportJMSBrokerType;
	protected Text transportMQTTConnectionFactory;
	protected Text transportMQTTServerHostName;
	protected Text transportMQTTServerPort;
	protected Text transportMQTTTopicName;
	protected EMFComboViewer transportMQTTSubscriptionQOS;
	protected Button transportMQTTSessionClean;
	protected Text transportMQTTSslEnable;
	protected Text transportMQTTTemporaryStoreDirectory;
	protected Text transportMQTTSubscriptionUsername;
	protected Text transportMQTTSubscriptionPassword;
	protected Text transportMQTTClientId;
	protected Text truststore;
	protected Text keystore;
	protected Text sslVerifyClient;
	protected Text sslProtocol;
	protected Text httpsProtocols;
	protected Text certificateRevocationVerifier;
	protected Text inboundHL7Port;
	protected Button inboundHL7AutoAck;
	protected Text inboundHL7MessagePreProcessor;
	protected Text inboundHL7CharSet;
	protected Text inboundHL7TimeOut;
	protected Button inboundHL7ValidateMessage;
	protected Button inboundHL7BuildInvalidMessages;
	protected Button inboundHL7PassThroughInvalidMessages;
	protected Text zookeeperConnect;
	protected Text groupId;
	protected Text contentType;
	protected EMFComboViewer consumerType;
	protected EMFComboViewer topicsOrTopicFilter;
	protected Text topicsName;
	protected EMFComboViewer topicFilterFrom;
	protected Text topicFilterName;
	protected Text simpleConsumerTopic;
	protected Text simpleConsumerBrokers;
	protected Text simpleConsumerPort;
	protected Text simpleConsumerPartition;
	protected Text simpleConsumerMaxMessagesToRead;
	protected Text threadCount;
	protected Text consumerId;
	protected Text socketTimeoutMs;
	protected Text socketReceiveBufferBytes;
	protected Text fetchMessageMaxBytes;
	protected Text numConsumerFetches;
	protected Button autoCommitEnable;
	protected Text autoCommitIntervalMs;
	protected Text queuedMaxMessageChunks;
	protected Text rebalanceMaxRetries;
	protected Text fetchMinBytes;
	protected Text fetchWaitMaxMs;
	protected Text rebalanceBackoffMs;
	protected Text refreshLeaderBackoffMs;
	protected EMFComboViewer autoOffsetReset;
	protected Text consumerTimeoutMs;
	protected Button excludeInternalTopics;
	protected EMFComboViewer partitionAssignmentStrategy;
	protected Text clientId;
	protected Text zookeeperSessionTimeoutMs;
	protected Text zookeeperConnectionTimeoutMs;
	protected Text zookeeperSyncTimeMs;
	protected EMFComboViewer offsetsStorage;
	protected Text offsetsChannelBackoffMs;
	protected Text offsetsChannelSocketTimeoutMs;
	protected Text offsetsCommitMaxRetries;
	protected Button dualCommitEnabled;
	protected Text inboundCxfRmHost;
	protected Text inboundCxfRmPort;
	protected Text inboundCxfRmConfigFile;
	protected Button enableSSL;
	protected ReferencesTable serviceParameters;
	protected List<ViewerFilter> serviceParametersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> serviceParametersFilters = new ArrayList<ViewerFilter>();
	protected Button suspend;
	protected Text transportRabbitMqConnectionFactory;
	protected Text transportRabbitMqServerHostName;
	protected Text transportRabbitMqServerPort;
	protected Text transportRabbitMqServerUserName;
	protected Text transportRabbitMqServerPassword;
	protected Text transportRabbitMqQueueName;
	protected Text transportRabbitMqExchangeName;
	protected Text transportRabbitMqQueueDurable;
	protected Text transportRabbitMqQueueExclusive;
	protected Text transportRabbitMqQueueAutoDelete;
	protected Text transportRabbitMqQueueAutoAck;
	protected Text transportRabbitMqQueueRoutingKey;
	protected Text transportRabbitMqQueueDeliveryMode;
	protected Text transportRabbitMqExchangeType;
	protected Text transportRabbitMqExchangeDurable;
	protected Text transportRabbitMqExchangeAutoDelete;
	protected Text transportRabbitMqServerVirtualHost;
	protected Text transportRabbitMqFactoryHeartbeat;
	protected Text transportRabbitMqConnectionSslEnabled;
	protected Text transportRabbitMqConnectionSslKeystoreLocation;
	protected Text transportRabbitMqConnectionSslKeystoreType;
	protected Text transportRabbitMqConnectionSslKeystorePassword;
	protected Text transportRabbitMqConnectionSslTruststoreLocation;
	protected Text transportRabbitMqConnectionSslTruststoreType;
	protected Text transportRabbitMqConnectionSslTruststorePassword;
	protected Text transportRabbitMqConnectionSslVersion;
	protected Text transportRabbitMqMessageContentType;
	protected Text transportRabbitMqConnectionRetryCount;
	protected Text transportRabbitMqConnectionRetryInterval;
	protected Text transportRabbitMqServerRetryInterval;
	protected Text wsInboundPort;
	protected EMFComboViewer wsClientSideBroadcastLevel;
	protected Text wsOutflowDispatchSequence;
	protected Text wsOutflowDispatchFaultSequence;
	protected Text wsBossThreadPoolSize;
	protected Text wsWorkerThreadPoolSize;
	protected Text wsSubprotocolHandlerClass;
	protected Text wsPipelineHandlerClass;
	protected Text transportFeedURL;
	protected EMFComboViewer transportFeedType;
	protected Button traceEnabled;
	protected Button statisticsEnabled;
	protected Text transportJMSRetriesBeforeSuspension;
	protected Button transportJMSResetConnectionOnPollingSuspension;
	protected Text transportJMSPollingSuspensionPeriod;
	protected Text transportMQTTSslKeystoreLocation;
	protected Text transportMQTTSslKeystoreType;
	protected Text transportMQTTSslKeystorePassword;
	protected Text transportMQTTSslTruststoreLocation;
	protected Text transportMQTTSslTruststoreType;
	protected Text transportMQTTSslTruststorePassword;
	protected Text transportMQTTSslVersion;
	protected Text wssSslKeyStoreFile;
	protected Text wssSslKeyStorePass;
	protected Text wssSslTrustStoreFile;
	protected Text wssSslTrustStorePass;
	protected Text wssSslCertPass;
	protected Text wsDefaultContentType;
	protected Text wsShutdownStatusCode;
	protected Text wsShutdownStatusMessage;
	protected Button wsUsePortOffset;
	protected Text wssSslProtocols;
	protected Text wssSslCipherSuites;
	protected Text transportRabbitMqConsumerQos;
	// Start of user code  for transportRabbitMqConsumerQosKey widgets declarations
	
	// End of user code

	protected EMFComboViewer transportRabbitMqConsumerQosType;
	protected Text transportJMSDBUrl;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InboundEndpointPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence inboundEndpointStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inboundEndpointStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.description);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.name);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.type);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.class_);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.protocol);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.interval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.sequential);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.coordination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.truststore);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.keystore);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.sslProtocol);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.groupId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.contentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicsName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.topicFilterName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.threadCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.consumerId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.clientId);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.enableSSL);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.suspend);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosKey);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl);
		
		
		composer = new PartComposer(inboundEndpointStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.InboundEndpoint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.commentsList) {
					return createCommentsListMultiValuedEditor(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.name) {
					return createNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.class_) {
					return createClass_Text(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.protocol) {
					return createProtocolText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour) {
					return createInboundEndpointBehaviourEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort) {
					return createInboundHttpPortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore) {
					return createInboundWorkerPoolSizeCoreText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax) {
					return createInboundWorkerPoolSizeMaxText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec) {
					return createInboundWorkerThreadKeepAliveSecText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength) {
					return createInboundWorkerPoolQueueLengthText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId) {
					return createInboundThreadGroupIdText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId) {
					return createInboundThreadIdText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern) {
					return createDispatchFilterPatternText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.interval) {
					return createIntervalText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.sequential) {
					return createSequentialCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.coordination) {
					return createCoordinationCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI) {
					return createTransportVFSFileURIText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl) {
					return createWso2mbConnectionUrlText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType) {
					return createTransportVFSContentTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern) {
					return createTransportVFSFileNamePatternText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval) {
					return createTransportVFSFileProcessIntervalText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount) {
					return createTransportVFSFileProcessCountText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking) {
					return createTransportVFSLockingEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount) {
					return createTransportVFSMaxRetryCountText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove) {
					return createTransportVFSMoveAfterFailedMoveText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout) {
					return createTransportVFSReconnectTimeoutText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription) {
					return createTransportJMSSharedSubscriptionCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName) {
					return createTransportJMSSubscriptionNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers) {
					return createTransportJMSPinnedServersText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess) {
					return createTransportVFSActionAfterProcessEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess) {
					return createTransportVFSMoveAfterProcessText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors) {
					return createTransportVFSActionAfterErrorsEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors) {
					return createTransportVFSMoveAfterErrorsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName) {
					return createTransportVFSFailedRecordsFileNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination) {
					return createTransportVFSFailedRecordsFileDestinationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat) {
					return createTransportVFSMoveFailedRecordTimestampFormatText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration) {
					return createTransportVFSFailedRecordNextRetryDurationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure) {
					return createTransportVFSActionAfterFailureEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure) {
					return createTransportVFSMoveAfterFailureText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI) {
					return createTransportVFSReplyFileURIText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName) {
					return createTransportVFSReplyFileNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease) {
					return createTransportVFSAutoLockReleaseCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval) {
					return createTransportVFSAutoLockReleaseIntervalText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode) {
					return createTransportVFSLockReleaseSameNodeCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock) {
					return createTransportVFSDistributedLockCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming) {
					return createTransportVFSStreamingCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild) {
					return createTransportVFSBuildCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout) {
					return createTransportVFSDistributedTimeoutText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial) {
					return createJavaNamingFactoryInitialText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl) {
					return createJavaNamingProviderUrlText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName) {
					return createTransportJMSConnectionFactoryJNDINameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType) {
					return createTransportJMSConnectionFactoryTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers) {
					return createTransportJMSConcurrentConsumersText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination) {
					return createTransportJMSDestinationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted) {
					return createTransportJMSSessionTransactedCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement) {
					return createTransportJMSSessionAcknowledgementEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel) {
					return createTransportJMSCacheLevelEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName) {
					return createTransportJMSUserNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword) {
					return createTransportJMSPasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion) {
					return createTransportJMSJMSSpecVersionText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable) {
					return createTransportJMSSubscriptionDurableText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID) {
					return createTransportJMSDurableSubscriberClientIDText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector) {
					return createTransportJMSMessageSelectorText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration) {
					return createTransportJMSRetryDurationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat) {
					return createTransportVFSMoveTimestampFormatText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute) {
					return createTransportVFSFileSortAttributeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending) {
					return createTransportVFSFileSortAscendingCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat) {
					return createTransportVFSSubFolderTimestampFormatText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder) {
					return createTransportVFSCreateFolderCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout) {
					return createTransportJMSReceiveTimeoutText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType) {
					return createTransportJMSContentTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty) {
					return createTransportJMSContentTypePropertyText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination) {
					return createTransportJMSReplyDestinationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal) {
					return createTransportJMSPubSubNoLocalText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName) {
					return createTransportJMSDurableSubscriberNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType) {
					return createTransportJMSBrokerTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory) {
					return createTransportMQTTConnectionFactoryText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName) {
					return createTransportMQTTServerHostNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort) {
					return createTransportMQTTServerPortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName) {
					return createTransportMQTTTopicNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS) {
					return createTransportMQTTSubscriptionQOSEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean) {
					return createTransportMQTTSessionCleanCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable) {
					return createTransportMQTTSslEnableText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory) {
					return createTransportMQTTTemporaryStoreDirectoryText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername) {
					return createTransportMQTTSubscriptionUsernameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword) {
					return createTransportMQTTSubscriptionPasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId) {
					return createTransportMQTTClientIdText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.truststore) {
					return createTruststoreText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.keystore) {
					return createKeystoreText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient) {
					return createSslVerifyClientText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.sslProtocol) {
					return createSslProtocolText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols) {
					return createHttpsProtocolsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier) {
					return createCertificateRevocationVerifierText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port) {
					return createInboundHL7PortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck) {
					return createInboundHL7AutoAckCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor) {
					return createInboundHL7MessagePreProcessorText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet) {
					return createInboundHL7CharSetText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut) {
					return createInboundHL7TimeOutText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage) {
					return createInboundHL7ValidateMessageCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages) {
					return createInboundHL7BuildInvalidMessagesCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages) {
					return createInboundHL7PassThroughInvalidMessagesCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect) {
					return createZookeeperConnectText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.groupId) {
					return createGroupIdText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.contentType) {
					return createContentTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.consumerType) {
					return createConsumerTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter) {
					return createTopicsOrTopicFilterEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicsName) {
					return createTopicsNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom) {
					return createTopicFilterFromEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.topicFilterName) {
					return createTopicFilterNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic) {
					return createSimpleConsumerTopicText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers) {
					return createSimpleConsumerBrokersText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort) {
					return createSimpleConsumerPortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition) {
					return createSimpleConsumerPartitionText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead) {
					return createSimpleConsumerMaxMessagesToReadText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.threadCount) {
					return createThreadCountText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.consumerId) {
					return createConsumerIdText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs) {
					return createSocketTimeoutMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes) {
					return createSocketReceiveBufferBytesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes) {
					return createFetchMessageMaxBytesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches) {
					return createNumConsumerFetchesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable) {
					return createAutoCommitEnableCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs) {
					return createAutoCommitIntervalMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks) {
					return createQueuedMaxMessageChunksText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries) {
					return createRebalanceMaxRetriesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes) {
					return createFetchMinBytesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs) {
					return createFetchWaitMaxMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs) {
					return createRebalanceBackoffMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs) {
					return createRefreshLeaderBackoffMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset) {
					return createAutoOffsetResetEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs) {
					return createConsumerTimeoutMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics) {
					return createExcludeInternalTopicsCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy) {
					return createPartitionAssignmentStrategyEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.clientId) {
					return createClientIdText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs) {
					return createZookeeperSessionTimeoutMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs) {
					return createZookeeperConnectionTimeoutMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs) {
					return createZookeeperSyncTimeMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage) {
					return createOffsetsStorageEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs) {
					return createOffsetsChannelBackoffMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs) {
					return createOffsetsChannelSocketTimeoutMsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries) {
					return createOffsetsCommitMaxRetriesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled) {
					return createDualCommitEnabledCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost) {
					return createInboundCxfRmHostText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort) {
					return createInboundCxfRmPortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile) {
					return createInboundCxfRmConfigFileText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.enableSSL) {
					return createEnableSSLCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.serviceParameters) {
					return createServiceParametersAdvancedTableComposition(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.suspend) {
					return createSuspendCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory) {
					return createTransportRabbitMqConnectionFactoryText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName) {
					return createTransportRabbitMqServerHostNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort) {
					return createTransportRabbitMqServerPortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName) {
					return createTransportRabbitMqServerUserNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword) {
					return createTransportRabbitMqServerPasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName) {
					return createTransportRabbitMqQueueNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName) {
					return createTransportRabbitMqExchangeNameText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable) {
					return createTransportRabbitMqQueueDurableText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive) {
					return createTransportRabbitMqQueueExclusiveText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete) {
					return createTransportRabbitMqQueueAutoDeleteText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck) {
					return createTransportRabbitMqQueueAutoAckText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey) {
					return createTransportRabbitMqQueueRoutingKeyText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode) {
					return createTransportRabbitMqQueueDeliveryModeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType) {
					return createTransportRabbitMqExchangeTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable) {
					return createTransportRabbitMqExchangeDurableText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete) {
					return createTransportRabbitMqExchangeAutoDeleteText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost) {
					return createTransportRabbitMqServerVirtualHostText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat) {
					return createTransportRabbitMqFactoryHeartbeatText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled) {
					return createTransportRabbitMqConnectionSslEnabledText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation) {
					return createTransportRabbitMqConnectionSslKeystoreLocationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType) {
					return createTransportRabbitMqConnectionSslKeystoreTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword) {
					return createTransportRabbitMqConnectionSslKeystorePasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation) {
					return createTransportRabbitMqConnectionSslTruststoreLocationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType) {
					return createTransportRabbitMqConnectionSslTruststoreTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword) {
					return createTransportRabbitMqConnectionSslTruststorePasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion) {
					return createTransportRabbitMqConnectionSslVersionText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType) {
					return createTransportRabbitMqMessageContentTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount) {
					return createTransportRabbitMqConnectionRetryCountText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval) {
					return createTransportRabbitMqConnectionRetryIntervalText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval) {
					return createTransportRabbitMqServerRetryIntervalText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort) {
					return createWsInboundPortText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel) {
					return createWsClientSideBroadcastLevelEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence) {
					return createWsOutflowDispatchSequenceText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence) {
					return createWsOutflowDispatchFaultSequenceText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize) {
					return createWsBossThreadPoolSizeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize) {
					return createWsWorkerThreadPoolSizeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass) {
					return createWsSubprotocolHandlerClassText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass) {
					return createWsPipelineHandlerClassText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL) {
					return createTransportFeedURLText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportFeedType) {
					return createTransportFeedTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.traceEnabled) {
					return createTraceEnabledCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled) {
					return createStatisticsEnabledCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension) {
					return createTransportJMSRetriesBeforeSuspensionText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension) {
					return createTransportJMSResetConnectionOnPollingSuspensionCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod) {
					return createTransportJMSPollingSuspensionPeriodText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation) {
					return createTransportMQTTSslKeystoreLocationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType) {
					return createTransportMQTTSslKeystoreTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword) {
					return createTransportMQTTSslKeystorePasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation) {
					return createTransportMQTTSslTruststoreLocationText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType) {
					return createTransportMQTTSslTruststoreTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword) {
					return createTransportMQTTSslTruststorePasswordText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion) {
					return createTransportMQTTSslVersionText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile) {
					return createWssSslKeyStoreFileText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass) {
					return createWssSslKeyStorePassText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile) {
					return createWssSslTrustStoreFileText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass) {
					return createWssSslTrustStorePassText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass) {
					return createWssSslCertPassText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType) {
					return createWsDefaultContentTypeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode) {
					return createWsShutdownStatusCodeText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage) {
					return createWsShutdownStatusMessageText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset) {
					return createWsUsePortOffsetCheckbox(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols) {
					return createWssSslProtocolsText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites) {
					return createWssSslCipherSuitesText(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos) {
					return createTransportRabbitMqConsumerQosText(parent);
				}
				// Start of user code for transportRabbitMqConsumerQosKey addToPart creation
				
				// End of user code
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType) {
					return createTransportRabbitMqConsumerQosTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl) {
					return createTransportJMSDBUrlText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EsbMessages.InboundEndpointPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.description, EsbMessages.InboundEndpointPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EsbViewsRepository.InboundEndpoint.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.description, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	protected Composite createCommentsListMultiValuedEditor(Composite parent) {
		commentsList = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData commentsListData = new GridData(GridData.FILL_HORIZONTAL);
		commentsListData.horizontalSpan = 2;
		commentsList.setLayoutData(commentsListData);
		EditingUtils.setID(commentsList, EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		EditingUtils.setEEFtype(commentsList, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editCommentsList = new Button(parent, SWT.NONE);
		editCommentsList.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.commentsList, EsbMessages.InboundEndpointPropertiesEditionPart_CommentsListLabel));
		GridData editCommentsListData = new GridData();
		editCommentsList.setLayoutData(editCommentsListData);
		editCommentsList.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						commentsList.getShell(), "InboundEndpoint", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						commentsListList, EsbPackage.eINSTANCE.getEsbElement_CommentsList().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					commentsListList = dialog.getResult();
					if (commentsListList == null) {
						commentsListList = new BasicEList();
					}
					commentsList.setText(commentsListList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.commentsList, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(commentsListList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editCommentsList, EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		EditingUtils.setEEFtype(editCommentsList, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createCommentsListMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.name, EsbMessages.InboundEndpointPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EsbViewsRepository.InboundEndpoint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.name, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.type, EsbMessages.InboundEndpointPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(EsbViewsRepository.InboundEndpoint.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.type, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createClass_Text(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.class_, EsbMessages.InboundEndpointPropertiesEditionPart_Class_Label);
		class_ = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData class_Data = new GridData(GridData.FILL_HORIZONTAL);
		class_.setLayoutData(class_Data);
		class_.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.class_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, class_.getText()));
			}

		});
		class_.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.class_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, class_.getText()));
				}
			}

		});
		EditingUtils.setID(class_, EsbViewsRepository.InboundEndpoint.Properties.class_);
		EditingUtils.setEEFtype(class_, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.class_, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClass_Text

		// End of user code
		return parent;
	}

	
	protected Composite createProtocolText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.protocol, EsbMessages.InboundEndpointPropertiesEditionPart_ProtocolLabel);
		protocol = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData protocolData = new GridData(GridData.FILL_HORIZONTAL);
		protocol.setLayoutData(protocolData);
		protocol.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.protocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocol.getText()));
			}

		});
		protocol.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.protocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocol.getText()));
				}
			}

		});
		EditingUtils.setID(protocol, EsbViewsRepository.InboundEndpoint.Properties.protocol);
		EditingUtils.setEEFtype(protocol, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.protocol, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createProtocolText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundEndpointBehaviourEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour, EsbMessages.InboundEndpointPropertiesEditionPart_InboundEndpointBehaviourLabel);
		inboundEndpointBehaviour = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		inboundEndpointBehaviour.setContentProvider(new ArrayContentProvider());
		inboundEndpointBehaviour.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData inboundEndpointBehaviourData = new GridData(GridData.FILL_HORIZONTAL);
		inboundEndpointBehaviour.getCombo().setLayoutData(inboundEndpointBehaviourData);
		inboundEndpointBehaviour.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInboundEndpointBehaviour()));
			}

		});
		inboundEndpointBehaviour.setID(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundEndpointBehaviourEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHttpPortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHttpPortLabel);
		inboundHttpPort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundHttpPortData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHttpPort.setLayoutData(inboundHttpPortData);
		inboundHttpPort.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHttpPort.getText()));
			}

		});
		inboundHttpPort.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHttpPort.getText()));
				}
			}

		});
		EditingUtils.setID(inboundHttpPort, EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort);
		EditingUtils.setEEFtype(inboundHttpPort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHttpPortText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerPoolSizeCoreText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerPoolSizeCoreLabel);
		inboundWorkerPoolSizeCore = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundWorkerPoolSizeCoreData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerPoolSizeCore.setLayoutData(inboundWorkerPoolSizeCoreData);
		inboundWorkerPoolSizeCore.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeCore.getText()));
			}

		});
		inboundWorkerPoolSizeCore.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeCore.getText()));
				}
			}

		});
		EditingUtils.setID(inboundWorkerPoolSizeCore, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore);
		EditingUtils.setEEFtype(inboundWorkerPoolSizeCore, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerPoolSizeCoreText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerPoolSizeMaxText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerPoolSizeMaxLabel);
		inboundWorkerPoolSizeMax = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundWorkerPoolSizeMaxData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerPoolSizeMax.setLayoutData(inboundWorkerPoolSizeMaxData);
		inboundWorkerPoolSizeMax.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeMax.getText()));
			}

		});
		inboundWorkerPoolSizeMax.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolSizeMax.getText()));
				}
			}

		});
		EditingUtils.setID(inboundWorkerPoolSizeMax, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax);
		EditingUtils.setEEFtype(inboundWorkerPoolSizeMax, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerPoolSizeMaxText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerThreadKeepAliveSecText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerThreadKeepAliveSecLabel);
		inboundWorkerThreadKeepAliveSec = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundWorkerThreadKeepAliveSecData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerThreadKeepAliveSec.setLayoutData(inboundWorkerThreadKeepAliveSecData);
		inboundWorkerThreadKeepAliveSec.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerThreadKeepAliveSec.getText()));
			}

		});
		inboundWorkerThreadKeepAliveSec.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerThreadKeepAliveSec.getText()));
				}
			}

		});
		EditingUtils.setID(inboundWorkerThreadKeepAliveSec, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec);
		EditingUtils.setEEFtype(inboundWorkerThreadKeepAliveSec, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerThreadKeepAliveSecText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundWorkerPoolQueueLengthText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, EsbMessages.InboundEndpointPropertiesEditionPart_InboundWorkerPoolQueueLengthLabel);
		inboundWorkerPoolQueueLength = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundWorkerPoolQueueLengthData = new GridData(GridData.FILL_HORIZONTAL);
		inboundWorkerPoolQueueLength.setLayoutData(inboundWorkerPoolQueueLengthData);
		inboundWorkerPoolQueueLength.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolQueueLength.getText()));
			}

		});
		inboundWorkerPoolQueueLength.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundWorkerPoolQueueLength.getText()));
				}
			}

		});
		EditingUtils.setID(inboundWorkerPoolQueueLength, EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength);
		EditingUtils.setEEFtype(inboundWorkerPoolQueueLength, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundWorkerPoolQueueLengthText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundThreadGroupIdText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, EsbMessages.InboundEndpointPropertiesEditionPart_InboundThreadGroupIdLabel);
		inboundThreadGroupId = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundThreadGroupIdData = new GridData(GridData.FILL_HORIZONTAL);
		inboundThreadGroupId.setLayoutData(inboundThreadGroupIdData);
		inboundThreadGroupId.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadGroupId.getText()));
			}

		});
		inboundThreadGroupId.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadGroupId.getText()));
				}
			}

		});
		EditingUtils.setID(inboundThreadGroupId, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId);
		EditingUtils.setEEFtype(inboundThreadGroupId, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundThreadGroupIdText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundThreadIdText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, EsbMessages.InboundEndpointPropertiesEditionPart_InboundThreadIdLabel);
		inboundThreadId = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundThreadIdData = new GridData(GridData.FILL_HORIZONTAL);
		inboundThreadId.setLayoutData(inboundThreadIdData);
		inboundThreadId.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadId.getText()));
			}

		});
		inboundThreadId.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundThreadId.getText()));
				}
			}

		});
		EditingUtils.setID(inboundThreadId, EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId);
		EditingUtils.setEEFtype(inboundThreadId, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundThreadIdText

		// End of user code
		return parent;
	}

	
	protected Composite createDispatchFilterPatternText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, EsbMessages.InboundEndpointPropertiesEditionPart_DispatchFilterPatternLabel);
		dispatchFilterPattern = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData dispatchFilterPatternData = new GridData(GridData.FILL_HORIZONTAL);
		dispatchFilterPattern.setLayoutData(dispatchFilterPatternData);
		dispatchFilterPattern.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dispatchFilterPattern.getText()));
			}

		});
		dispatchFilterPattern.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dispatchFilterPattern.getText()));
				}
			}

		});
		EditingUtils.setID(dispatchFilterPattern, EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern);
		EditingUtils.setEEFtype(dispatchFilterPattern, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDispatchFilterPatternText

		// End of user code
		return parent;
	}

	
	protected Composite createIntervalText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.interval, EsbMessages.InboundEndpointPropertiesEditionPart_IntervalLabel);
		interval = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData intervalData = new GridData(GridData.FILL_HORIZONTAL);
		interval.setLayoutData(intervalData);
		interval.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.interval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interval.getText()));
			}

		});
		interval.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.interval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, interval.getText()));
				}
			}

		});
		EditingUtils.setID(interval, EsbViewsRepository.InboundEndpoint.Properties.interval);
		EditingUtils.setEEFtype(interval, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.interval, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createSequentialCheckbox(Composite parent) {
		sequential = new Button(parent, SWT.CHECK);
		sequential.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.sequential, EsbMessages.InboundEndpointPropertiesEditionPart_SequentialLabel));
		sequential.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.sequential, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(sequential.getSelection())));
			}

		});
		GridData sequentialData = new GridData(GridData.FILL_HORIZONTAL);
		sequentialData.horizontalSpan = 2;
		sequential.setLayoutData(sequentialData);
		EditingUtils.setID(sequential, EsbViewsRepository.InboundEndpoint.Properties.sequential);
		EditingUtils.setEEFtype(sequential, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.sequential, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSequentialCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createCoordinationCheckbox(Composite parent) {
		coordination = new Button(parent, SWT.CHECK);
		coordination.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.coordination, EsbMessages.InboundEndpointPropertiesEditionPart_CoordinationLabel));
		coordination.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.coordination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(coordination.getSelection())));
			}

		});
		GridData coordinationData = new GridData(GridData.FILL_HORIZONTAL);
		coordinationData.horizontalSpan = 2;
		coordination.setLayoutData(coordinationData);
		EditingUtils.setID(coordination, EsbViewsRepository.InboundEndpoint.Properties.coordination);
		EditingUtils.setEEFtype(coordination, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.coordination, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCoordinationCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileURIText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileURILabel);
		transportVFSFileURI = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFileURIData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileURI.setLayoutData(transportVFSFileURIData);
		transportVFSFileURI.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileURI.getText()));
			}

		});
		transportVFSFileURI.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileURI.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFileURI, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI);
		EditingUtils.setEEFtype(transportVFSFileURI, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileURIText

		// End of user code
		return parent;
	}

	
	protected Composite createWso2mbConnectionUrlText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, EsbMessages.InboundEndpointPropertiesEditionPart_Wso2mbConnectionUrlLabel);
		wso2mbConnectionUrl = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wso2mbConnectionUrlData = new GridData(GridData.FILL_HORIZONTAL);
		wso2mbConnectionUrl.setLayoutData(wso2mbConnectionUrlData);
		wso2mbConnectionUrl.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wso2mbConnectionUrl.getText()));
			}

		});
		wso2mbConnectionUrl.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wso2mbConnectionUrl.getText()));
				}
			}

		});
		EditingUtils.setID(wso2mbConnectionUrl, EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl);
		EditingUtils.setEEFtype(wso2mbConnectionUrl, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWso2mbConnectionUrlText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSContentTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSContentTypeLabel);
		transportVFSContentType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSContentType.setLayoutData(transportVFSContentTypeData);
		transportVFSContentType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSContentType.getText()));
			}

		});
		transportVFSContentType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSContentType.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSContentType, EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType);
		EditingUtils.setEEFtype(transportVFSContentType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileNamePatternText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileNamePatternLabel);
		transportVFSFileNamePattern = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFileNamePatternData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileNamePattern.setLayoutData(transportVFSFileNamePatternData);
		transportVFSFileNamePattern.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileNamePattern.getText()));
			}

		});
		transportVFSFileNamePattern.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileNamePattern.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFileNamePattern, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern);
		EditingUtils.setEEFtype(transportVFSFileNamePattern, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileNamePatternText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileProcessIntervalText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileProcessIntervalLabel);
		transportVFSFileProcessInterval = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFileProcessIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileProcessInterval.setLayoutData(transportVFSFileProcessIntervalData);
		transportVFSFileProcessInterval.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessInterval.getText()));
			}

		});
		transportVFSFileProcessInterval.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessInterval.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFileProcessInterval, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval);
		EditingUtils.setEEFtype(transportVFSFileProcessInterval, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileProcessIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileProcessCountText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileProcessCountLabel);
		transportVFSFileProcessCount = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFileProcessCountData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileProcessCount.setLayoutData(transportVFSFileProcessCountData);
		transportVFSFileProcessCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessCount.getText()));
			}

		});
		transportVFSFileProcessCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFileProcessCount.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFileProcessCount, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount);
		EditingUtils.setEEFtype(transportVFSFileProcessCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileProcessCountText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSLockingEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSLockingLabel);
		transportVFSLocking = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportVFSLocking.setContentProvider(new ArrayContentProvider());
		transportVFSLocking.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSLockingData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSLocking.getCombo().setLayoutData(transportVFSLockingData);
		transportVFSLocking.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSLocking()));
			}

		});
		transportVFSLocking.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSLockingEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMaxRetryCountText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMaxRetryCountLabel);
		transportVFSMaxRetryCount = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMaxRetryCountData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMaxRetryCount.setLayoutData(transportVFSMaxRetryCountData);
		transportVFSMaxRetryCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMaxRetryCount.getText()));
			}

		});
		transportVFSMaxRetryCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMaxRetryCount.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMaxRetryCount, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount);
		EditingUtils.setEEFtype(transportVFSMaxRetryCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMaxRetryCountText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterFailedMoveText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterFailedMoveLabel);
		transportVFSMoveAfterFailedMove = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMoveAfterFailedMoveData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterFailedMove.setLayoutData(transportVFSMoveAfterFailedMoveData);
		transportVFSMoveAfterFailedMove.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailedMove.getText()));
			}

		});
		transportVFSMoveAfterFailedMove.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailedMove.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMoveAfterFailedMove, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove);
		EditingUtils.setEEFtype(transportVFSMoveAfterFailedMove, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterFailedMoveText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSReconnectTimeoutText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSReconnectTimeoutLabel);
		transportVFSReconnectTimeout = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSReconnectTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSReconnectTimeout.setLayoutData(transportVFSReconnectTimeoutData);
		transportVFSReconnectTimeout.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReconnectTimeout.getText()));
			}

		});
		transportVFSReconnectTimeout.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReconnectTimeout.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSReconnectTimeout, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout);
		EditingUtils.setEEFtype(transportVFSReconnectTimeout, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSReconnectTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSharedSubscriptionCheckbox(Composite parent) {
		transportJMSSharedSubscription = new Button(parent, SWT.CHECK);
		transportJMSSharedSubscription.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSharedSubscriptionLabel));
		transportJMSSharedSubscription.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportJMSSharedSubscription.getSelection())));
			}

		});
		GridData transportJMSSharedSubscriptionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSharedSubscriptionData.horizontalSpan = 2;
		transportJMSSharedSubscription.setLayoutData(transportJMSSharedSubscriptionData);
		EditingUtils.setID(transportJMSSharedSubscription, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription);
		EditingUtils.setEEFtype(transportJMSSharedSubscription, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSharedSubscriptionCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSubscriptionNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSubscriptionNameLabel);
		transportJMSSubscriptionName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSSubscriptionNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSubscriptionName.setLayoutData(transportJMSSubscriptionNameData);
		transportJMSSubscriptionName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionName.getText()));
			}

		});
		transportJMSSubscriptionName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionName.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSSubscriptionName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName);
		EditingUtils.setEEFtype(transportJMSSubscriptionName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSubscriptionNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPinnedServersText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPinnedServersLabel);
		transportJMSPinnedServers = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSPinnedServersData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPinnedServers.setLayoutData(transportJMSPinnedServersData);
		transportJMSPinnedServers.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPinnedServers.getText()));
			}

		});
		transportJMSPinnedServers.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPinnedServers.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSPinnedServers, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers);
		EditingUtils.setEEFtype(transportJMSPinnedServers, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPinnedServersText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSActionAfterProcessEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSActionAfterProcessLabel);
		transportVFSActionAfterProcess = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportVFSActionAfterProcess.setContentProvider(new ArrayContentProvider());
		transportVFSActionAfterProcess.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSActionAfterProcessData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSActionAfterProcess.getCombo().setLayoutData(transportVFSActionAfterProcessData);
		transportVFSActionAfterProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSActionAfterProcess()));
			}

		});
		transportVFSActionAfterProcess.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSActionAfterProcessEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterProcessText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterProcessLabel);
		transportVFSMoveAfterProcess = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMoveAfterProcessData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterProcess.setLayoutData(transportVFSMoveAfterProcessData);
		transportVFSMoveAfterProcess.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterProcess.getText()));
			}

		});
		transportVFSMoveAfterProcess.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterProcess.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMoveAfterProcess, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess);
		EditingUtils.setEEFtype(transportVFSMoveAfterProcess, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterProcessText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSActionAfterErrorsEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSActionAfterErrorsLabel);
		transportVFSActionAfterErrors = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportVFSActionAfterErrors.setContentProvider(new ArrayContentProvider());
		transportVFSActionAfterErrors.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSActionAfterErrorsData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSActionAfterErrors.getCombo().setLayoutData(transportVFSActionAfterErrorsData);
		transportVFSActionAfterErrors.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSActionAfterErrors()));
			}

		});
		transportVFSActionAfterErrors.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSActionAfterErrorsEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterErrorsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterErrorsLabel);
		transportVFSMoveAfterErrors = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMoveAfterErrorsData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterErrors.setLayoutData(transportVFSMoveAfterErrorsData);
		transportVFSMoveAfterErrors.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterErrors.getText()));
			}

		});
		transportVFSMoveAfterErrors.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterErrors.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMoveAfterErrors, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors);
		EditingUtils.setEEFtype(transportVFSMoveAfterErrors, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterErrorsText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFailedRecordsFileNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFailedRecordsFileNameLabel);
		transportVFSFailedRecordsFileName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFailedRecordsFileNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFailedRecordsFileName.setLayoutData(transportVFSFailedRecordsFileNameData);
		transportVFSFailedRecordsFileName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileName.getText()));
			}

		});
		transportVFSFailedRecordsFileName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileName.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFailedRecordsFileName, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName);
		EditingUtils.setEEFtype(transportVFSFailedRecordsFileName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFailedRecordsFileNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFailedRecordsFileDestinationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFailedRecordsFileDestinationLabel);
		transportVFSFailedRecordsFileDestination = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFailedRecordsFileDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFailedRecordsFileDestination.setLayoutData(transportVFSFailedRecordsFileDestinationData);
		transportVFSFailedRecordsFileDestination.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileDestination.getText()));
			}

		});
		transportVFSFailedRecordsFileDestination.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordsFileDestination.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFailedRecordsFileDestination, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination);
		EditingUtils.setEEFtype(transportVFSFailedRecordsFileDestination, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFailedRecordsFileDestinationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveFailedRecordTimestampFormatText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveFailedRecordTimestampFormatLabel);
		transportVFSMoveFailedRecordTimestampFormat = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMoveFailedRecordTimestampFormatData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveFailedRecordTimestampFormat.setLayoutData(transportVFSMoveFailedRecordTimestampFormatData);
		transportVFSMoveFailedRecordTimestampFormat.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveFailedRecordTimestampFormat.getText()));
			}

		});
		transportVFSMoveFailedRecordTimestampFormat.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveFailedRecordTimestampFormat.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMoveFailedRecordTimestampFormat, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat);
		EditingUtils.setEEFtype(transportVFSMoveFailedRecordTimestampFormat, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveFailedRecordTimestampFormatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFailedRecordNextRetryDurationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFailedRecordNextRetryDurationLabel);
		transportVFSFailedRecordNextRetryDuration = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSFailedRecordNextRetryDurationData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFailedRecordNextRetryDuration.setLayoutData(transportVFSFailedRecordNextRetryDurationData);
		transportVFSFailedRecordNextRetryDuration.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordNextRetryDuration.getText()));
			}

		});
		transportVFSFailedRecordNextRetryDuration.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSFailedRecordNextRetryDuration.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSFailedRecordNextRetryDuration, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration);
		EditingUtils.setEEFtype(transportVFSFailedRecordNextRetryDuration, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFailedRecordNextRetryDurationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSActionAfterFailureEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSActionAfterFailureLabel);
		transportVFSActionAfterFailure = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportVFSActionAfterFailure.setContentProvider(new ArrayContentProvider());
		transportVFSActionAfterFailure.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSActionAfterFailureData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSActionAfterFailure.getCombo().setLayoutData(transportVFSActionAfterFailureData);
		transportVFSActionAfterFailure.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSActionAfterFailure()));
			}

		});
		transportVFSActionAfterFailure.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSActionAfterFailureEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveAfterFailureText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveAfterFailureLabel);
		transportVFSMoveAfterFailure = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMoveAfterFailureData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveAfterFailure.setLayoutData(transportVFSMoveAfterFailureData);
		transportVFSMoveAfterFailure.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailure.getText()));
			}

		});
		transportVFSMoveAfterFailure.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveAfterFailure.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMoveAfterFailure, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure);
		EditingUtils.setEEFtype(transportVFSMoveAfterFailure, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveAfterFailureText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSReplyFileURIText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSReplyFileURILabel);
		transportVFSReplyFileURI = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSReplyFileURIData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSReplyFileURI.setLayoutData(transportVFSReplyFileURIData);
		transportVFSReplyFileURI.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileURI.getText()));
			}

		});
		transportVFSReplyFileURI.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileURI.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSReplyFileURI, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI);
		EditingUtils.setEEFtype(transportVFSReplyFileURI, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSReplyFileURIText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSReplyFileNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSReplyFileNameLabel);
		transportVFSReplyFileName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSReplyFileNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSReplyFileName.setLayoutData(transportVFSReplyFileNameData);
		transportVFSReplyFileName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileName.getText()));
			}

		});
		transportVFSReplyFileName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSReplyFileName.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSReplyFileName, EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName);
		EditingUtils.setEEFtype(transportVFSReplyFileName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSReplyFileNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSAutoLockReleaseCheckbox(Composite parent) {
		transportVFSAutoLockRelease = new Button(parent, SWT.CHECK);
		transportVFSAutoLockRelease.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSAutoLockReleaseLabel));
		transportVFSAutoLockRelease.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSAutoLockRelease.getSelection())));
			}

		});
		GridData transportVFSAutoLockReleaseData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSAutoLockReleaseData.horizontalSpan = 2;
		transportVFSAutoLockRelease.setLayoutData(transportVFSAutoLockReleaseData);
		EditingUtils.setID(transportVFSAutoLockRelease, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease);
		EditingUtils.setEEFtype(transportVFSAutoLockRelease, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSAutoLockReleaseCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSAutoLockReleaseIntervalText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSAutoLockReleaseIntervalLabel);
		transportVFSAutoLockReleaseInterval = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSAutoLockReleaseIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSAutoLockReleaseInterval.setLayoutData(transportVFSAutoLockReleaseIntervalData);
		transportVFSAutoLockReleaseInterval.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSAutoLockReleaseInterval.getText()));
			}

		});
		transportVFSAutoLockReleaseInterval.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSAutoLockReleaseInterval.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSAutoLockReleaseInterval, EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval);
		EditingUtils.setEEFtype(transportVFSAutoLockReleaseInterval, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSAutoLockReleaseIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSLockReleaseSameNodeCheckbox(Composite parent) {
		transportVFSLockReleaseSameNode = new Button(parent, SWT.CHECK);
		transportVFSLockReleaseSameNode.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSLockReleaseSameNodeLabel));
		transportVFSLockReleaseSameNode.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSLockReleaseSameNode.getSelection())));
			}

		});
		GridData transportVFSLockReleaseSameNodeData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSLockReleaseSameNodeData.horizontalSpan = 2;
		transportVFSLockReleaseSameNode.setLayoutData(transportVFSLockReleaseSameNodeData);
		EditingUtils.setID(transportVFSLockReleaseSameNode, EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode);
		EditingUtils.setEEFtype(transportVFSLockReleaseSameNode, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSLockReleaseSameNodeCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSDistributedLockCheckbox(Composite parent) {
		transportVFSDistributedLock = new Button(parent, SWT.CHECK);
		transportVFSDistributedLock.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSDistributedLockLabel));
		transportVFSDistributedLock.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSDistributedLock.getSelection())));
			}

		});
		GridData transportVFSDistributedLockData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSDistributedLockData.horizontalSpan = 2;
		transportVFSDistributedLock.setLayoutData(transportVFSDistributedLockData);
		EditingUtils.setID(transportVFSDistributedLock, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock);
		EditingUtils.setEEFtype(transportVFSDistributedLock, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSDistributedLockCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSStreamingCheckbox(Composite parent) {
		transportVFSStreaming = new Button(parent, SWT.CHECK);
		transportVFSStreaming.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSStreamingLabel));
		transportVFSStreaming.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSStreaming.getSelection())));
			}

		});
		GridData transportVFSStreamingData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSStreamingData.horizontalSpan = 2;
		transportVFSStreaming.setLayoutData(transportVFSStreamingData);
		EditingUtils.setID(transportVFSStreaming, EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming);
		EditingUtils.setEEFtype(transportVFSStreaming, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSStreamingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSBuildCheckbox(Composite parent) {
		transportVFSBuild = new Button(parent, SWT.CHECK);
		transportVFSBuild.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSBuildLabel));
		transportVFSBuild.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSBuild.getSelection())));
			}

		});
		GridData transportVFSBuildData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSBuildData.horizontalSpan = 2;
		transportVFSBuild.setLayoutData(transportVFSBuildData);
		EditingUtils.setID(transportVFSBuild, EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild);
		EditingUtils.setEEFtype(transportVFSBuild, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSBuildCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSDistributedTimeoutText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSDistributedTimeoutLabel);
		transportVFSDistributedTimeout = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSDistributedTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSDistributedTimeout.setLayoutData(transportVFSDistributedTimeoutData);
		transportVFSDistributedTimeout.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSDistributedTimeout.getText()));
			}

		});
		transportVFSDistributedTimeout.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSDistributedTimeout.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSDistributedTimeout, EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout);
		EditingUtils.setEEFtype(transportVFSDistributedTimeout, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSDistributedTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createJavaNamingFactoryInitialText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, EsbMessages.InboundEndpointPropertiesEditionPart_JavaNamingFactoryInitialLabel);
		javaNamingFactoryInitial = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData javaNamingFactoryInitialData = new GridData(GridData.FILL_HORIZONTAL);
		javaNamingFactoryInitial.setLayoutData(javaNamingFactoryInitialData);
		javaNamingFactoryInitial.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingFactoryInitial.getText()));
			}

		});
		javaNamingFactoryInitial.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingFactoryInitial.getText()));
				}
			}

		});
		EditingUtils.setID(javaNamingFactoryInitial, EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial);
		EditingUtils.setEEFtype(javaNamingFactoryInitial, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createJavaNamingFactoryInitialText

		// End of user code
		return parent;
	}

	
	protected Composite createJavaNamingProviderUrlText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, EsbMessages.InboundEndpointPropertiesEditionPart_JavaNamingProviderUrlLabel);
		javaNamingProviderUrl = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData javaNamingProviderUrlData = new GridData(GridData.FILL_HORIZONTAL);
		javaNamingProviderUrl.setLayoutData(javaNamingProviderUrlData);
		javaNamingProviderUrl.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingProviderUrl.getText()));
			}

		});
		javaNamingProviderUrl.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, javaNamingProviderUrl.getText()));
				}
			}

		});
		EditingUtils.setID(javaNamingProviderUrl, EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl);
		EditingUtils.setEEFtype(javaNamingProviderUrl, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createJavaNamingProviderUrlText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSConnectionFactoryJNDINameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSConnectionFactoryJNDINameLabel);
		transportJMSConnectionFactoryJNDIName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSConnectionFactoryJNDINameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSConnectionFactoryJNDIName.setLayoutData(transportJMSConnectionFactoryJNDINameData);
		transportJMSConnectionFactoryJNDIName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConnectionFactoryJNDIName.getText()));
			}

		});
		transportJMSConnectionFactoryJNDIName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConnectionFactoryJNDIName.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSConnectionFactoryJNDIName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName);
		EditingUtils.setEEFtype(transportJMSConnectionFactoryJNDIName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSConnectionFactoryJNDINameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSConnectionFactoryTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSConnectionFactoryTypeLabel);
		transportJMSConnectionFactoryType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportJMSConnectionFactoryType.setContentProvider(new ArrayContentProvider());
		transportJMSConnectionFactoryType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSConnectionFactoryTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSConnectionFactoryType.getCombo().setLayoutData(transportJMSConnectionFactoryTypeData);
		transportJMSConnectionFactoryType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSConnectionFactoryType()));
			}

		});
		transportJMSConnectionFactoryType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSConnectionFactoryTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSConcurrentConsumersText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSConcurrentConsumersLabel);
		transportJMSConcurrentConsumers = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSConcurrentConsumersData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSConcurrentConsumers.setLayoutData(transportJMSConcurrentConsumersData);
		transportJMSConcurrentConsumers.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConcurrentConsumers.getText()));
			}

		});
		transportJMSConcurrentConsumers.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSConcurrentConsumers.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSConcurrentConsumers, EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers);
		EditingUtils.setEEFtype(transportJMSConcurrentConsumers, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSConcurrentConsumersText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDestinationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDestinationLabel);
		transportJMSDestination = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDestination.setLayoutData(transportJMSDestinationData);
		transportJMSDestination.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDestination.getText()));
			}

		});
		transportJMSDestination.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDestination.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSDestination, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination);
		EditingUtils.setEEFtype(transportJMSDestination, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDestinationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSessionTransactedCheckbox(Composite parent) {
		transportJMSSessionTransacted = new Button(parent, SWT.CHECK);
		transportJMSSessionTransacted.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSessionTransactedLabel));
		transportJMSSessionTransacted.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportJMSSessionTransacted.getSelection())));
			}

		});
		GridData transportJMSSessionTransactedData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSessionTransactedData.horizontalSpan = 2;
		transportJMSSessionTransacted.setLayoutData(transportJMSSessionTransactedData);
		EditingUtils.setID(transportJMSSessionTransacted, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted);
		EditingUtils.setEEFtype(transportJMSSessionTransacted, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSessionTransactedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSessionAcknowledgementEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSessionAcknowledgementLabel);
		transportJMSSessionAcknowledgement = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportJMSSessionAcknowledgement.setContentProvider(new ArrayContentProvider());
		transportJMSSessionAcknowledgement.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSSessionAcknowledgementData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSessionAcknowledgement.getCombo().setLayoutData(transportJMSSessionAcknowledgementData);
		transportJMSSessionAcknowledgement.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSSessionAcknowledgement()));
			}

		});
		transportJMSSessionAcknowledgement.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSessionAcknowledgementEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSCacheLevelEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSCacheLevelLabel);
		transportJMSCacheLevel = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportJMSCacheLevel.setContentProvider(new ArrayContentProvider());
		transportJMSCacheLevel.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSCacheLevelData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSCacheLevel.getCombo().setLayoutData(transportJMSCacheLevelData);
		transportJMSCacheLevel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSCacheLevel()));
			}

		});
		transportJMSCacheLevel.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSCacheLevelEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSUserNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSUserNameLabel);
		transportJMSUserName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSUserNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSUserName.setLayoutData(transportJMSUserNameData);
		transportJMSUserName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSUserName.getText()));
			}

		});
		transportJMSUserName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSUserName.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSUserName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName);
		EditingUtils.setEEFtype(transportJMSUserName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSUserNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPasswordLabel);
		transportJMSPassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPassword.setLayoutData(transportJMSPasswordData);
		transportJMSPassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPassword.getText()));
			}

		});
		transportJMSPassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSPassword, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword);
		EditingUtils.setEEFtype(transportJMSPassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSJMSSpecVersionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSJMSSpecVersionLabel);
		transportJMSJMSSpecVersion = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSJMSSpecVersionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSJMSSpecVersion.setLayoutData(transportJMSJMSSpecVersionData);
		transportJMSJMSSpecVersion.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSJMSSpecVersion.getText()));
			}

		});
		transportJMSJMSSpecVersion.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSJMSSpecVersion.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSJMSSpecVersion, EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion);
		EditingUtils.setEEFtype(transportJMSJMSSpecVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSJMSSpecVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSSubscriptionDurableText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSSubscriptionDurableLabel);
		transportJMSSubscriptionDurable = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSSubscriptionDurableData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSSubscriptionDurable.setLayoutData(transportJMSSubscriptionDurableData);
		transportJMSSubscriptionDurable.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionDurable.getText()));
			}

		});
		transportJMSSubscriptionDurable.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSSubscriptionDurable.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSSubscriptionDurable, EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable);
		EditingUtils.setEEFtype(transportJMSSubscriptionDurable, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSSubscriptionDurableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDurableSubscriberClientIDText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDurableSubscriberClientIDLabel);
		transportJMSDurableSubscriberClientID = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSDurableSubscriberClientIDData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDurableSubscriberClientID.setLayoutData(transportJMSDurableSubscriberClientIDData);
		transportJMSDurableSubscriberClientID.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberClientID.getText()));
			}

		});
		transportJMSDurableSubscriberClientID.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberClientID.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSDurableSubscriberClientID, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID);
		EditingUtils.setEEFtype(transportJMSDurableSubscriberClientID, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDurableSubscriberClientIDText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSMessageSelectorText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSMessageSelectorLabel);
		transportJMSMessageSelector = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSMessageSelectorData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSMessageSelector.setLayoutData(transportJMSMessageSelectorData);
		transportJMSMessageSelector.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSMessageSelector.getText()));
			}

		});
		transportJMSMessageSelector.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSMessageSelector.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSMessageSelector, EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector);
		EditingUtils.setEEFtype(transportJMSMessageSelector, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSMessageSelectorText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSRetryDurationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSRetryDurationLabel);
		transportJMSRetryDuration = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSRetryDurationData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSRetryDuration.setLayoutData(transportJMSRetryDurationData);
		transportJMSRetryDuration.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetryDuration.getText()));
			}

		});
		transportJMSRetryDuration.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetryDuration.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSRetryDuration, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration);
		EditingUtils.setEEFtype(transportJMSRetryDuration, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSRetryDurationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSMoveTimestampFormatText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSMoveTimestampFormatLabel);
		transportVFSMoveTimestampFormat = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSMoveTimestampFormatData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSMoveTimestampFormat.setLayoutData(transportVFSMoveTimestampFormatData);
		transportVFSMoveTimestampFormat.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveTimestampFormat.getText()));
			}

		});
		transportVFSMoveTimestampFormat.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSMoveTimestampFormat.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSMoveTimestampFormat, EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat);
		EditingUtils.setEEFtype(transportVFSMoveTimestampFormat, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSMoveTimestampFormatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileSortAttributeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileSortAttributeLabel);
		transportVFSFileSortAttribute = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportVFSFileSortAttribute.setContentProvider(new ArrayContentProvider());
		transportVFSFileSortAttribute.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportVFSFileSortAttributeData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileSortAttribute.getCombo().setLayoutData(transportVFSFileSortAttributeData);
		transportVFSFileSortAttribute.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportVFSFileSortAttribute()));
			}

		});
		transportVFSFileSortAttribute.setID(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileSortAttributeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSFileSortAscendingCheckbox(Composite parent) {
		transportVFSFileSortAscending = new Button(parent, SWT.CHECK);
		transportVFSFileSortAscending.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSFileSortAscendingLabel));
		transportVFSFileSortAscending.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSFileSortAscending.getSelection())));
			}

		});
		GridData transportVFSFileSortAscendingData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSFileSortAscendingData.horizontalSpan = 2;
		transportVFSFileSortAscending.setLayoutData(transportVFSFileSortAscendingData);
		EditingUtils.setID(transportVFSFileSortAscending, EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending);
		EditingUtils.setEEFtype(transportVFSFileSortAscending, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSFileSortAscendingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSSubFolderTimestampFormatText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSSubFolderTimestampFormatLabel);
		transportVFSSubFolderTimestampFormat = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportVFSSubFolderTimestampFormatData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSSubFolderTimestampFormat.setLayoutData(transportVFSSubFolderTimestampFormatData);
		transportVFSSubFolderTimestampFormat.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSSubFolderTimestampFormat.getText()));
			}

		});
		transportVFSSubFolderTimestampFormat.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportVFSSubFolderTimestampFormat.getText()));
				}
			}

		});
		EditingUtils.setID(transportVFSSubFolderTimestampFormat, EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat);
		EditingUtils.setEEFtype(transportVFSSubFolderTimestampFormat, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSSubFolderTimestampFormatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportVFSCreateFolderCheckbox(Composite parent) {
		transportVFSCreateFolder = new Button(parent, SWT.CHECK);
		transportVFSCreateFolder.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder, EsbMessages.InboundEndpointPropertiesEditionPart_TransportVFSCreateFolderLabel));
		transportVFSCreateFolder.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportVFSCreateFolder.getSelection())));
			}

		});
		GridData transportVFSCreateFolderData = new GridData(GridData.FILL_HORIZONTAL);
		transportVFSCreateFolderData.horizontalSpan = 2;
		transportVFSCreateFolder.setLayoutData(transportVFSCreateFolderData);
		EditingUtils.setID(transportVFSCreateFolder, EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder);
		EditingUtils.setEEFtype(transportVFSCreateFolder, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportVFSCreateFolderCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSReceiveTimeoutText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSReceiveTimeoutLabel);
		transportJMSReceiveTimeout = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSReceiveTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSReceiveTimeout.setLayoutData(transportJMSReceiveTimeoutData);
		transportJMSReceiveTimeout.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReceiveTimeout.getText()));
			}

		});
		transportJMSReceiveTimeout.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReceiveTimeout.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSReceiveTimeout, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout);
		EditingUtils.setEEFtype(transportJMSReceiveTimeout, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSReceiveTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSContentTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSContentTypeLabel);
		transportJMSContentType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSContentType.setLayoutData(transportJMSContentTypeData);
		transportJMSContentType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentType.getText()));
			}

		});
		transportJMSContentType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentType.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSContentType, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType);
		EditingUtils.setEEFtype(transportJMSContentType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSContentTypePropertyText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSContentTypePropertyLabel);
		transportJMSContentTypeProperty = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSContentTypePropertyData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSContentTypeProperty.setLayoutData(transportJMSContentTypePropertyData);
		transportJMSContentTypeProperty.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentTypeProperty.getText()));
			}

		});
		transportJMSContentTypeProperty.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSContentTypeProperty.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSContentTypeProperty, EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty);
		EditingUtils.setEEFtype(transportJMSContentTypeProperty, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSContentTypePropertyText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSReplyDestinationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSReplyDestinationLabel);
		transportJMSReplyDestination = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSReplyDestinationData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSReplyDestination.setLayoutData(transportJMSReplyDestinationData);
		transportJMSReplyDestination.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReplyDestination.getText()));
			}

		});
		transportJMSReplyDestination.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSReplyDestination.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSReplyDestination, EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination);
		EditingUtils.setEEFtype(transportJMSReplyDestination, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSReplyDestinationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPubSubNoLocalText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPubSubNoLocalLabel);
		transportJMSPubSubNoLocal = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSPubSubNoLocalData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPubSubNoLocal.setLayoutData(transportJMSPubSubNoLocalData);
		transportJMSPubSubNoLocal.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPubSubNoLocal.getText()));
			}

		});
		transportJMSPubSubNoLocal.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPubSubNoLocal.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSPubSubNoLocal, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal);
		EditingUtils.setEEFtype(transportJMSPubSubNoLocal, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPubSubNoLocalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDurableSubscriberNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDurableSubscriberNameLabel);
		transportJMSDurableSubscriberName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSDurableSubscriberNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDurableSubscriberName.setLayoutData(transportJMSDurableSubscriberNameData);
		transportJMSDurableSubscriberName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberName.getText()));
			}

		});
		transportJMSDurableSubscriberName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDurableSubscriberName.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSDurableSubscriberName, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName);
		EditingUtils.setEEFtype(transportJMSDurableSubscriberName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDurableSubscriberNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSBrokerTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSBrokerTypeLabel);
		transportJMSBrokerType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportJMSBrokerType.setContentProvider(new ArrayContentProvider());
		transportJMSBrokerType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportJMSBrokerTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSBrokerType.getCombo().setLayoutData(transportJMSBrokerTypeData);
		transportJMSBrokerType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportJMSBrokerType()));
			}

		});
		transportJMSBrokerType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSBrokerTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTConnectionFactoryText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTConnectionFactoryLabel);
		transportMQTTConnectionFactory = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTConnectionFactoryData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTConnectionFactory.setLayoutData(transportMQTTConnectionFactoryData);
		transportMQTTConnectionFactory.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTConnectionFactory.getText()));
			}

		});
		transportMQTTConnectionFactory.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTConnectionFactory.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTConnectionFactory, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory);
		EditingUtils.setEEFtype(transportMQTTConnectionFactory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTConnectionFactoryText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTServerHostNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTServerHostNameLabel);
		transportMQTTServerHostName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTServerHostNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTServerHostName.setLayoutData(transportMQTTServerHostNameData);
		transportMQTTServerHostName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerHostName.getText()));
			}

		});
		transportMQTTServerHostName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerHostName.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTServerHostName, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName);
		EditingUtils.setEEFtype(transportMQTTServerHostName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTServerHostNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTServerPortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTServerPortLabel);
		transportMQTTServerPort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTServerPortData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTServerPort.setLayoutData(transportMQTTServerPortData);
		transportMQTTServerPort.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerPort.getText()));
			}

		});
		transportMQTTServerPort.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTServerPort.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTServerPort, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort);
		EditingUtils.setEEFtype(transportMQTTServerPort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTServerPortText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTTopicNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTTopicNameLabel);
		transportMQTTTopicName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTTopicNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTTopicName.setLayoutData(transportMQTTTopicNameData);
		transportMQTTTopicName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTopicName.getText()));
			}

		});
		transportMQTTTopicName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTopicName.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTTopicName, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName);
		EditingUtils.setEEFtype(transportMQTTTopicName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTTopicNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSubscriptionQOSEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSubscriptionQOSLabel);
		transportMQTTSubscriptionQOS = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportMQTTSubscriptionQOS.setContentProvider(new ArrayContentProvider());
		transportMQTTSubscriptionQOS.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportMQTTSubscriptionQOSData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSubscriptionQOS.getCombo().setLayoutData(transportMQTTSubscriptionQOSData);
		transportMQTTSubscriptionQOS.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportMQTTSubscriptionQOS()));
			}

		});
		transportMQTTSubscriptionQOS.setID(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSubscriptionQOSEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSessionCleanCheckbox(Composite parent) {
		transportMQTTSessionClean = new Button(parent, SWT.CHECK);
		transportMQTTSessionClean.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSessionCleanLabel));
		transportMQTTSessionClean.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportMQTTSessionClean.getSelection())));
			}

		});
		GridData transportMQTTSessionCleanData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSessionCleanData.horizontalSpan = 2;
		transportMQTTSessionClean.setLayoutData(transportMQTTSessionCleanData);
		EditingUtils.setID(transportMQTTSessionClean, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean);
		EditingUtils.setEEFtype(transportMQTTSessionClean, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSessionCleanCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslEnableText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslEnableLabel);
		transportMQTTSslEnable = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslEnableData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslEnable.setLayoutData(transportMQTTSslEnableData);
		transportMQTTSslEnable.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslEnable.getText()));
			}

		});
		transportMQTTSslEnable.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslEnable.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslEnable, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable);
		EditingUtils.setEEFtype(transportMQTTSslEnable, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslEnableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTTemporaryStoreDirectoryText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTTemporaryStoreDirectoryLabel);
		transportMQTTTemporaryStoreDirectory = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTTemporaryStoreDirectoryData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTTemporaryStoreDirectory.setLayoutData(transportMQTTTemporaryStoreDirectoryData);
		transportMQTTTemporaryStoreDirectory.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTemporaryStoreDirectory.getText()));
			}

		});
		transportMQTTTemporaryStoreDirectory.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTTemporaryStoreDirectory.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTTemporaryStoreDirectory, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory);
		EditingUtils.setEEFtype(transportMQTTTemporaryStoreDirectory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTTemporaryStoreDirectoryText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSubscriptionUsernameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSubscriptionUsernameLabel);
		transportMQTTSubscriptionUsername = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSubscriptionUsernameData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSubscriptionUsername.setLayoutData(transportMQTTSubscriptionUsernameData);
		transportMQTTSubscriptionUsername.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionUsername.getText()));
			}

		});
		transportMQTTSubscriptionUsername.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionUsername.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSubscriptionUsername, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername);
		EditingUtils.setEEFtype(transportMQTTSubscriptionUsername, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSubscriptionUsernameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSubscriptionPasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSubscriptionPasswordLabel);
		transportMQTTSubscriptionPassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSubscriptionPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSubscriptionPassword.setLayoutData(transportMQTTSubscriptionPasswordData);
		transportMQTTSubscriptionPassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionPassword.getText()));
			}

		});
		transportMQTTSubscriptionPassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSubscriptionPassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSubscriptionPassword, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword);
		EditingUtils.setEEFtype(transportMQTTSubscriptionPassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSubscriptionPasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTClientIdText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTClientIdLabel);
		transportMQTTClientId = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTClientIdData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTClientId.setLayoutData(transportMQTTClientIdData);
		transportMQTTClientId.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTClientId.getText()));
			}

		});
		transportMQTTClientId.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTClientId.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTClientId, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId);
		EditingUtils.setEEFtype(transportMQTTClientId, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTClientIdText

		// End of user code
		return parent;
	}

	
	protected Composite createTruststoreText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.truststore, EsbMessages.InboundEndpointPropertiesEditionPart_TruststoreLabel);
		truststore = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData truststoreData = new GridData(GridData.FILL_HORIZONTAL);
		truststore.setLayoutData(truststoreData);
		truststore.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.truststore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, truststore.getText()));
			}

		});
		truststore.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.truststore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, truststore.getText()));
				}
			}

		});
		EditingUtils.setID(truststore, EsbViewsRepository.InboundEndpoint.Properties.truststore);
		EditingUtils.setEEFtype(truststore, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.truststore, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTruststoreText

		// End of user code
		return parent;
	}

	
	protected Composite createKeystoreText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.keystore, EsbMessages.InboundEndpointPropertiesEditionPart_KeystoreLabel);
		keystore = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData keystoreData = new GridData(GridData.FILL_HORIZONTAL);
		keystore.setLayoutData(keystoreData);
		keystore.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.keystore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, keystore.getText()));
			}

		});
		keystore.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.keystore, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, keystore.getText()));
				}
			}

		});
		EditingUtils.setID(keystore, EsbViewsRepository.InboundEndpoint.Properties.keystore);
		EditingUtils.setEEFtype(keystore, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.keystore, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createKeystoreText

		// End of user code
		return parent;
	}

	
	protected Composite createSslVerifyClientText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, EsbMessages.InboundEndpointPropertiesEditionPart_SslVerifyClientLabel);
		sslVerifyClient = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData sslVerifyClientData = new GridData(GridData.FILL_HORIZONTAL);
		sslVerifyClient.setLayoutData(sslVerifyClientData);
		sslVerifyClient.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslVerifyClient.getText()));
			}

		});
		sslVerifyClient.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslVerifyClient.getText()));
				}
			}

		});
		EditingUtils.setID(sslVerifyClient, EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient);
		EditingUtils.setEEFtype(sslVerifyClient, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSslVerifyClientText

		// End of user code
		return parent;
	}

	
	protected Composite createSslProtocolText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, EsbMessages.InboundEndpointPropertiesEditionPart_SslProtocolLabel);
		sslProtocol = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData sslProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		sslProtocol.setLayoutData(sslProtocolData);
		sslProtocol.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslProtocol.getText()));
			}

		});
		sslProtocol.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sslProtocol.getText()));
				}
			}

		});
		EditingUtils.setID(sslProtocol, EsbViewsRepository.InboundEndpoint.Properties.sslProtocol);
		EditingUtils.setEEFtype(sslProtocol, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.sslProtocol, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSslProtocolText

		// End of user code
		return parent;
	}

	
	protected Composite createHttpsProtocolsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, EsbMessages.InboundEndpointPropertiesEditionPart_HttpsProtocolsLabel);
		httpsProtocols = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData httpsProtocolsData = new GridData(GridData.FILL_HORIZONTAL);
		httpsProtocols.setLayoutData(httpsProtocolsData);
		httpsProtocols.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, httpsProtocols.getText()));
			}

		});
		httpsProtocols.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, httpsProtocols.getText()));
				}
			}

		});
		EditingUtils.setID(httpsProtocols, EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols);
		EditingUtils.setEEFtype(httpsProtocols, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createHttpsProtocolsText

		// End of user code
		return parent;
	}

	
	protected Composite createCertificateRevocationVerifierText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, EsbMessages.InboundEndpointPropertiesEditionPart_CertificateRevocationVerifierLabel);
		certificateRevocationVerifier = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData certificateRevocationVerifierData = new GridData(GridData.FILL_HORIZONTAL);
		certificateRevocationVerifier.setLayoutData(certificateRevocationVerifierData);
		certificateRevocationVerifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, certificateRevocationVerifier.getText()));
			}

		});
		certificateRevocationVerifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, certificateRevocationVerifier.getText()));
				}
			}

		});
		EditingUtils.setID(certificateRevocationVerifier, EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier);
		EditingUtils.setEEFtype(certificateRevocationVerifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCertificateRevocationVerifierText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7PortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7PortLabel);
		inboundHL7Port = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundHL7PortData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7Port.setLayoutData(inboundHL7PortData);
		inboundHL7Port.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7Port.getText()));
			}

		});
		inboundHL7Port.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7Port.getText()));
				}
			}

		});
		EditingUtils.setID(inboundHL7Port, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port);
		EditingUtils.setEEFtype(inboundHL7Port, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7PortText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7AutoAckCheckbox(Composite parent) {
		inboundHL7AutoAck = new Button(parent, SWT.CHECK);
		inboundHL7AutoAck.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7AutoAckLabel));
		inboundHL7AutoAck.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7AutoAck.getSelection())));
			}

		});
		GridData inboundHL7AutoAckData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7AutoAckData.horizontalSpan = 2;
		inboundHL7AutoAck.setLayoutData(inboundHL7AutoAckData);
		EditingUtils.setID(inboundHL7AutoAck, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck);
		EditingUtils.setEEFtype(inboundHL7AutoAck, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7AutoAckCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7MessagePreProcessorText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7MessagePreProcessorLabel);
		inboundHL7MessagePreProcessor = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundHL7MessagePreProcessorData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7MessagePreProcessor.setLayoutData(inboundHL7MessagePreProcessorData);
		inboundHL7MessagePreProcessor.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7MessagePreProcessor.getText()));
			}

		});
		inboundHL7MessagePreProcessor.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7MessagePreProcessor.getText()));
				}
			}

		});
		EditingUtils.setID(inboundHL7MessagePreProcessor, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor);
		EditingUtils.setEEFtype(inboundHL7MessagePreProcessor, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7MessagePreProcessorText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7CharSetText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7CharSetLabel);
		inboundHL7CharSet = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundHL7CharSetData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7CharSet.setLayoutData(inboundHL7CharSetData);
		inboundHL7CharSet.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7CharSet.getText()));
			}

		});
		inboundHL7CharSet.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7CharSet.getText()));
				}
			}

		});
		EditingUtils.setID(inboundHL7CharSet, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet);
		EditingUtils.setEEFtype(inboundHL7CharSet, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7CharSetText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7TimeOutText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7TimeOutLabel);
		inboundHL7TimeOut = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundHL7TimeOutData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7TimeOut.setLayoutData(inboundHL7TimeOutData);
		inboundHL7TimeOut.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7TimeOut.getText()));
			}

		});
		inboundHL7TimeOut.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundHL7TimeOut.getText()));
				}
			}

		});
		EditingUtils.setID(inboundHL7TimeOut, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut);
		EditingUtils.setEEFtype(inboundHL7TimeOut, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7TimeOutText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7ValidateMessageCheckbox(Composite parent) {
		inboundHL7ValidateMessage = new Button(parent, SWT.CHECK);
		inboundHL7ValidateMessage.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7ValidateMessageLabel));
		inboundHL7ValidateMessage.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7ValidateMessage.getSelection())));
			}

		});
		GridData inboundHL7ValidateMessageData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7ValidateMessageData.horizontalSpan = 2;
		inboundHL7ValidateMessage.setLayoutData(inboundHL7ValidateMessageData);
		EditingUtils.setID(inboundHL7ValidateMessage, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage);
		EditingUtils.setEEFtype(inboundHL7ValidateMessage, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7ValidateMessageCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7BuildInvalidMessagesCheckbox(Composite parent) {
		inboundHL7BuildInvalidMessages = new Button(parent, SWT.CHECK);
		inboundHL7BuildInvalidMessages.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7BuildInvalidMessagesLabel));
		inboundHL7BuildInvalidMessages.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7BuildInvalidMessages.getSelection())));
			}

		});
		GridData inboundHL7BuildInvalidMessagesData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7BuildInvalidMessagesData.horizontalSpan = 2;
		inboundHL7BuildInvalidMessages.setLayoutData(inboundHL7BuildInvalidMessagesData);
		EditingUtils.setID(inboundHL7BuildInvalidMessages, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages);
		EditingUtils.setEEFtype(inboundHL7BuildInvalidMessages, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7BuildInvalidMessagesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundHL7PassThroughInvalidMessagesCheckbox(Composite parent) {
		inboundHL7PassThroughInvalidMessages = new Button(parent, SWT.CHECK);
		inboundHL7PassThroughInvalidMessages.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages, EsbMessages.InboundEndpointPropertiesEditionPart_InboundHL7PassThroughInvalidMessagesLabel));
		inboundHL7PassThroughInvalidMessages.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inboundHL7PassThroughInvalidMessages.getSelection())));
			}

		});
		GridData inboundHL7PassThroughInvalidMessagesData = new GridData(GridData.FILL_HORIZONTAL);
		inboundHL7PassThroughInvalidMessagesData.horizontalSpan = 2;
		inboundHL7PassThroughInvalidMessages.setLayoutData(inboundHL7PassThroughInvalidMessagesData);
		EditingUtils.setID(inboundHL7PassThroughInvalidMessages, EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages);
		EditingUtils.setEEFtype(inboundHL7PassThroughInvalidMessages, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundHL7PassThroughInvalidMessagesCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperConnectText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperConnectLabel);
		zookeeperConnect = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData zookeeperConnectData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperConnect.setLayoutData(zookeeperConnectData);
		zookeeperConnect.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnect.getText()));
			}

		});
		zookeeperConnect.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnect.getText()));
				}
			}

		});
		EditingUtils.setID(zookeeperConnect, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect);
		EditingUtils.setEEFtype(zookeeperConnect, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperConnectText

		// End of user code
		return parent;
	}

	
	protected Composite createGroupIdText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.groupId, EsbMessages.InboundEndpointPropertiesEditionPart_GroupIdLabel);
		groupId = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData groupIdData = new GridData(GridData.FILL_HORIZONTAL);
		groupId.setLayoutData(groupIdData);
		groupId.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.groupId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupId.getText()));
			}

		});
		groupId.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.groupId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupId.getText()));
				}
			}

		});
		EditingUtils.setID(groupId, EsbViewsRepository.InboundEndpoint.Properties.groupId);
		EditingUtils.setEEFtype(groupId, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.groupId, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createGroupIdText

		// End of user code
		return parent;
	}

	
	protected Composite createContentTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.contentType, EsbMessages.InboundEndpointPropertiesEditionPart_ContentTypeLabel);
		contentType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData contentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		contentType.setLayoutData(contentTypeData);
		contentType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.contentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, contentType.getText()));
			}

		});
		contentType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.contentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, contentType.getText()));
				}
			}

		});
		EditingUtils.setID(contentType, EsbViewsRepository.InboundEndpoint.Properties.contentType);
		EditingUtils.setEEFtype(contentType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.contentType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createConsumerTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.consumerType, EsbMessages.InboundEndpointPropertiesEditionPart_ConsumerTypeLabel);
		consumerType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		consumerType.setContentProvider(new ArrayContentProvider());
		consumerType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData consumerTypeData = new GridData(GridData.FILL_HORIZONTAL);
		consumerType.getCombo().setLayoutData(consumerTypeData);
		consumerType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.consumerType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConsumerType()));
			}

		});
		consumerType.setID(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.consumerType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createConsumerTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTopicsOrTopicFilterEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter, EsbMessages.InboundEndpointPropertiesEditionPart_TopicsOrTopicFilterLabel);
		topicsOrTopicFilter = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		topicsOrTopicFilter.setContentProvider(new ArrayContentProvider());
		topicsOrTopicFilter.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData topicsOrTopicFilterData = new GridData(GridData.FILL_HORIZONTAL);
		topicsOrTopicFilter.getCombo().setLayoutData(topicsOrTopicFilterData);
		topicsOrTopicFilter.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTopicsOrTopicFilter()));
			}

		});
		topicsOrTopicFilter.setID(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicsOrTopicFilterEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTopicsNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicsName, EsbMessages.InboundEndpointPropertiesEditionPart_TopicsNameLabel);
		topicsName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData topicsNameData = new GridData(GridData.FILL_HORIZONTAL);
		topicsName.setLayoutData(topicsNameData);
		topicsName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.topicsName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicsName.getText()));
			}

		});
		topicsName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.topicsName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicsName.getText()));
				}
			}

		});
		EditingUtils.setID(topicsName, EsbViewsRepository.InboundEndpoint.Properties.topicsName);
		EditingUtils.setEEFtype(topicsName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicsName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicsNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTopicFilterFromEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom, EsbMessages.InboundEndpointPropertiesEditionPart_TopicFilterFromLabel);
		topicFilterFrom = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		topicFilterFrom.setContentProvider(new ArrayContentProvider());
		topicFilterFrom.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData topicFilterFromData = new GridData(GridData.FILL_HORIZONTAL);
		topicFilterFrom.getCombo().setLayoutData(topicFilterFromData);
		topicFilterFrom.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTopicFilterFrom()));
			}

		});
		topicFilterFrom.setID(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicFilterFromEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTopicFilterNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, EsbMessages.InboundEndpointPropertiesEditionPart_TopicFilterNameLabel);
		topicFilterName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData topicFilterNameData = new GridData(GridData.FILL_HORIZONTAL);
		topicFilterName.setLayoutData(topicFilterNameData);
		topicFilterName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicFilterName.getText()));
			}

		});
		topicFilterName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, topicFilterName.getText()));
				}
			}

		});
		EditingUtils.setID(topicFilterName, EsbViewsRepository.InboundEndpoint.Properties.topicFilterName);
		EditingUtils.setEEFtype(topicFilterName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.topicFilterName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTopicFilterNameText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerTopicText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerTopicLabel);
		simpleConsumerTopic = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData simpleConsumerTopicData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerTopic.setLayoutData(simpleConsumerTopicData);
		simpleConsumerTopic.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerTopic.getText()));
			}

		});
		simpleConsumerTopic.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerTopic.getText()));
				}
			}

		});
		EditingUtils.setID(simpleConsumerTopic, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic);
		EditingUtils.setEEFtype(simpleConsumerTopic, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerTopicText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerBrokersText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerBrokersLabel);
		simpleConsumerBrokers = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData simpleConsumerBrokersData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerBrokers.setLayoutData(simpleConsumerBrokersData);
		simpleConsumerBrokers.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerBrokers.getText()));
			}

		});
		simpleConsumerBrokers.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerBrokers.getText()));
				}
			}

		});
		EditingUtils.setID(simpleConsumerBrokers, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers);
		EditingUtils.setEEFtype(simpleConsumerBrokers, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerBrokersText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerPortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerPortLabel);
		simpleConsumerPort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData simpleConsumerPortData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerPort.setLayoutData(simpleConsumerPortData);
		simpleConsumerPort.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPort.getText()));
			}

		});
		simpleConsumerPort.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPort.getText()));
				}
			}

		});
		EditingUtils.setID(simpleConsumerPort, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort);
		EditingUtils.setEEFtype(simpleConsumerPort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerPortText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerPartitionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerPartitionLabel);
		simpleConsumerPartition = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData simpleConsumerPartitionData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerPartition.setLayoutData(simpleConsumerPartitionData);
		simpleConsumerPartition.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPartition.getText()));
			}

		});
		simpleConsumerPartition.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerPartition.getText()));
				}
			}

		});
		EditingUtils.setID(simpleConsumerPartition, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition);
		EditingUtils.setEEFtype(simpleConsumerPartition, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerPartitionText

		// End of user code
		return parent;
	}

	
	protected Composite createSimpleConsumerMaxMessagesToReadText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, EsbMessages.InboundEndpointPropertiesEditionPart_SimpleConsumerMaxMessagesToReadLabel);
		simpleConsumerMaxMessagesToRead = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData simpleConsumerMaxMessagesToReadData = new GridData(GridData.FILL_HORIZONTAL);
		simpleConsumerMaxMessagesToRead.setLayoutData(simpleConsumerMaxMessagesToReadData);
		simpleConsumerMaxMessagesToRead.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerMaxMessagesToRead.getText()));
			}

		});
		simpleConsumerMaxMessagesToRead.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, simpleConsumerMaxMessagesToRead.getText()));
				}
			}

		});
		EditingUtils.setID(simpleConsumerMaxMessagesToRead, EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead);
		EditingUtils.setEEFtype(simpleConsumerMaxMessagesToRead, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSimpleConsumerMaxMessagesToReadText

		// End of user code
		return parent;
	}

	
	protected Composite createThreadCountText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.threadCount, EsbMessages.InboundEndpointPropertiesEditionPart_ThreadCountLabel);
		threadCount = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData threadCountData = new GridData(GridData.FILL_HORIZONTAL);
		threadCount.setLayoutData(threadCountData);
		threadCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.threadCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, threadCount.getText()));
			}

		});
		threadCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.threadCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, threadCount.getText()));
				}
			}

		});
		EditingUtils.setID(threadCount, EsbViewsRepository.InboundEndpoint.Properties.threadCount);
		EditingUtils.setEEFtype(threadCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.threadCount, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createThreadCountText

		// End of user code
		return parent;
	}

	
	protected Composite createConsumerIdText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.consumerId, EsbMessages.InboundEndpointPropertiesEditionPart_ConsumerIdLabel);
		consumerId = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData consumerIdData = new GridData(GridData.FILL_HORIZONTAL);
		consumerId.setLayoutData(consumerIdData);
		consumerId.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.consumerId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerId.getText()));
			}

		});
		consumerId.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.consumerId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerId.getText()));
				}
			}

		});
		EditingUtils.setID(consumerId, EsbViewsRepository.InboundEndpoint.Properties.consumerId);
		EditingUtils.setEEFtype(consumerId, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.consumerId, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createConsumerIdText

		// End of user code
		return parent;
	}

	
	protected Composite createSocketTimeoutMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_SocketTimeoutMsLabel);
		socketTimeoutMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData socketTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		socketTimeoutMs.setLayoutData(socketTimeoutMsData);
		socketTimeoutMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketTimeoutMs.getText()));
			}

		});
		socketTimeoutMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketTimeoutMs.getText()));
				}
			}

		});
		EditingUtils.setID(socketTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs);
		EditingUtils.setEEFtype(socketTimeoutMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSocketTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createSocketReceiveBufferBytesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, EsbMessages.InboundEndpointPropertiesEditionPart_SocketReceiveBufferBytesLabel);
		socketReceiveBufferBytes = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData socketReceiveBufferBytesData = new GridData(GridData.FILL_HORIZONTAL);
		socketReceiveBufferBytes.setLayoutData(socketReceiveBufferBytesData);
		socketReceiveBufferBytes.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketReceiveBufferBytes.getText()));
			}

		});
		socketReceiveBufferBytes.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, socketReceiveBufferBytes.getText()));
				}
			}

		});
		EditingUtils.setID(socketReceiveBufferBytes, EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes);
		EditingUtils.setEEFtype(socketReceiveBufferBytes, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSocketReceiveBufferBytesText

		// End of user code
		return parent;
	}

	
	protected Composite createFetchMessageMaxBytesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, EsbMessages.InboundEndpointPropertiesEditionPart_FetchMessageMaxBytesLabel);
		fetchMessageMaxBytes = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fetchMessageMaxBytesData = new GridData(GridData.FILL_HORIZONTAL);
		fetchMessageMaxBytes.setLayoutData(fetchMessageMaxBytesData);
		fetchMessageMaxBytes.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMessageMaxBytes.getText()));
			}

		});
		fetchMessageMaxBytes.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMessageMaxBytes.getText()));
				}
			}

		});
		EditingUtils.setID(fetchMessageMaxBytes, EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes);
		EditingUtils.setEEFtype(fetchMessageMaxBytes, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFetchMessageMaxBytesText

		// End of user code
		return parent;
	}

	
	protected Composite createNumConsumerFetchesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, EsbMessages.InboundEndpointPropertiesEditionPart_NumConsumerFetchesLabel);
		numConsumerFetches = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData numConsumerFetchesData = new GridData(GridData.FILL_HORIZONTAL);
		numConsumerFetches.setLayoutData(numConsumerFetchesData);
		numConsumerFetches.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, numConsumerFetches.getText()));
			}

		});
		numConsumerFetches.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, numConsumerFetches.getText()));
				}
			}

		});
		EditingUtils.setID(numConsumerFetches, EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches);
		EditingUtils.setEEFtype(numConsumerFetches, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNumConsumerFetchesText

		// End of user code
		return parent;
	}

	
	protected Composite createAutoCommitEnableCheckbox(Composite parent) {
		autoCommitEnable = new Button(parent, SWT.CHECK);
		autoCommitEnable.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable, EsbMessages.InboundEndpointPropertiesEditionPart_AutoCommitEnableLabel));
		autoCommitEnable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(autoCommitEnable.getSelection())));
			}

		});
		GridData autoCommitEnableData = new GridData(GridData.FILL_HORIZONTAL);
		autoCommitEnableData.horizontalSpan = 2;
		autoCommitEnable.setLayoutData(autoCommitEnableData);
		EditingUtils.setID(autoCommitEnable, EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable);
		EditingUtils.setEEFtype(autoCommitEnable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAutoCommitEnableCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createAutoCommitIntervalMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, EsbMessages.InboundEndpointPropertiesEditionPart_AutoCommitIntervalMsLabel);
		autoCommitIntervalMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData autoCommitIntervalMsData = new GridData(GridData.FILL_HORIZONTAL);
		autoCommitIntervalMs.setLayoutData(autoCommitIntervalMsData);
		autoCommitIntervalMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, autoCommitIntervalMs.getText()));
			}

		});
		autoCommitIntervalMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, autoCommitIntervalMs.getText()));
				}
			}

		});
		EditingUtils.setID(autoCommitIntervalMs, EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs);
		EditingUtils.setEEFtype(autoCommitIntervalMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAutoCommitIntervalMsText

		// End of user code
		return parent;
	}

	
	protected Composite createQueuedMaxMessageChunksText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, EsbMessages.InboundEndpointPropertiesEditionPart_QueuedMaxMessageChunksLabel);
		queuedMaxMessageChunks = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData queuedMaxMessageChunksData = new GridData(GridData.FILL_HORIZONTAL);
		queuedMaxMessageChunks.setLayoutData(queuedMaxMessageChunksData);
		queuedMaxMessageChunks.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, queuedMaxMessageChunks.getText()));
			}

		});
		queuedMaxMessageChunks.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, queuedMaxMessageChunks.getText()));
				}
			}

		});
		EditingUtils.setID(queuedMaxMessageChunks, EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks);
		EditingUtils.setEEFtype(queuedMaxMessageChunks, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createQueuedMaxMessageChunksText

		// End of user code
		return parent;
	}

	
	protected Composite createRebalanceMaxRetriesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, EsbMessages.InboundEndpointPropertiesEditionPart_RebalanceMaxRetriesLabel);
		rebalanceMaxRetries = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData rebalanceMaxRetriesData = new GridData(GridData.FILL_HORIZONTAL);
		rebalanceMaxRetries.setLayoutData(rebalanceMaxRetriesData);
		rebalanceMaxRetries.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceMaxRetries.getText()));
			}

		});
		rebalanceMaxRetries.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceMaxRetries.getText()));
				}
			}

		});
		EditingUtils.setID(rebalanceMaxRetries, EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries);
		EditingUtils.setEEFtype(rebalanceMaxRetries, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRebalanceMaxRetriesText

		// End of user code
		return parent;
	}

	
	protected Composite createFetchMinBytesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, EsbMessages.InboundEndpointPropertiesEditionPart_FetchMinBytesLabel);
		fetchMinBytes = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fetchMinBytesData = new GridData(GridData.FILL_HORIZONTAL);
		fetchMinBytes.setLayoutData(fetchMinBytesData);
		fetchMinBytes.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMinBytes.getText()));
			}

		});
		fetchMinBytes.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchMinBytes.getText()));
				}
			}

		});
		EditingUtils.setID(fetchMinBytes, EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes);
		EditingUtils.setEEFtype(fetchMinBytes, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFetchMinBytesText

		// End of user code
		return parent;
	}

	
	protected Composite createFetchWaitMaxMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, EsbMessages.InboundEndpointPropertiesEditionPart_FetchWaitMaxMsLabel);
		fetchWaitMaxMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fetchWaitMaxMsData = new GridData(GridData.FILL_HORIZONTAL);
		fetchWaitMaxMs.setLayoutData(fetchWaitMaxMsData);
		fetchWaitMaxMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchWaitMaxMs.getText()));
			}

		});
		fetchWaitMaxMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fetchWaitMaxMs.getText()));
				}
			}

		});
		EditingUtils.setID(fetchWaitMaxMs, EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs);
		EditingUtils.setEEFtype(fetchWaitMaxMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFetchWaitMaxMsText

		// End of user code
		return parent;
	}

	
	protected Composite createRebalanceBackoffMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, EsbMessages.InboundEndpointPropertiesEditionPart_RebalanceBackoffMsLabel);
		rebalanceBackoffMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData rebalanceBackoffMsData = new GridData(GridData.FILL_HORIZONTAL);
		rebalanceBackoffMs.setLayoutData(rebalanceBackoffMsData);
		rebalanceBackoffMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceBackoffMs.getText()));
			}

		});
		rebalanceBackoffMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rebalanceBackoffMs.getText()));
				}
			}

		});
		EditingUtils.setID(rebalanceBackoffMs, EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs);
		EditingUtils.setEEFtype(rebalanceBackoffMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRebalanceBackoffMsText

		// End of user code
		return parent;
	}

	
	protected Composite createRefreshLeaderBackoffMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, EsbMessages.InboundEndpointPropertiesEditionPart_RefreshLeaderBackoffMsLabel);
		refreshLeaderBackoffMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData refreshLeaderBackoffMsData = new GridData(GridData.FILL_HORIZONTAL);
		refreshLeaderBackoffMs.setLayoutData(refreshLeaderBackoffMsData);
		refreshLeaderBackoffMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, refreshLeaderBackoffMs.getText()));
			}

		});
		refreshLeaderBackoffMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, refreshLeaderBackoffMs.getText()));
				}
			}

		});
		EditingUtils.setID(refreshLeaderBackoffMs, EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs);
		EditingUtils.setEEFtype(refreshLeaderBackoffMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRefreshLeaderBackoffMsText

		// End of user code
		return parent;
	}

	
	protected Composite createAutoOffsetResetEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset, EsbMessages.InboundEndpointPropertiesEditionPart_AutoOffsetResetLabel);
		autoOffsetReset = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		autoOffsetReset.setContentProvider(new ArrayContentProvider());
		autoOffsetReset.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData autoOffsetResetData = new GridData(GridData.FILL_HORIZONTAL);
		autoOffsetReset.getCombo().setLayoutData(autoOffsetResetData);
		autoOffsetReset.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getAutoOffsetReset()));
			}

		});
		autoOffsetReset.setID(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAutoOffsetResetEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createConsumerTimeoutMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_ConsumerTimeoutMsLabel);
		consumerTimeoutMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData consumerTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		consumerTimeoutMs.setLayoutData(consumerTimeoutMsData);
		consumerTimeoutMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerTimeoutMs.getText()));
			}

		});
		consumerTimeoutMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumerTimeoutMs.getText()));
				}
			}

		});
		EditingUtils.setID(consumerTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs);
		EditingUtils.setEEFtype(consumerTimeoutMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createConsumerTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createExcludeInternalTopicsCheckbox(Composite parent) {
		excludeInternalTopics = new Button(parent, SWT.CHECK);
		excludeInternalTopics.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics, EsbMessages.InboundEndpointPropertiesEditionPart_ExcludeInternalTopicsLabel));
		excludeInternalTopics.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(excludeInternalTopics.getSelection())));
			}

		});
		GridData excludeInternalTopicsData = new GridData(GridData.FILL_HORIZONTAL);
		excludeInternalTopicsData.horizontalSpan = 2;
		excludeInternalTopics.setLayoutData(excludeInternalTopicsData);
		EditingUtils.setID(excludeInternalTopics, EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics);
		EditingUtils.setEEFtype(excludeInternalTopics, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createExcludeInternalTopicsCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createPartitionAssignmentStrategyEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy, EsbMessages.InboundEndpointPropertiesEditionPart_PartitionAssignmentStrategyLabel);
		partitionAssignmentStrategy = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		partitionAssignmentStrategy.setContentProvider(new ArrayContentProvider());
		partitionAssignmentStrategy.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData partitionAssignmentStrategyData = new GridData(GridData.FILL_HORIZONTAL);
		partitionAssignmentStrategy.getCombo().setLayoutData(partitionAssignmentStrategyData);
		partitionAssignmentStrategy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPartitionAssignmentStrategy()));
			}

		});
		partitionAssignmentStrategy.setID(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPartitionAssignmentStrategyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createClientIdText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.clientId, EsbMessages.InboundEndpointPropertiesEditionPart_ClientIdLabel);
		clientId = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData clientIdData = new GridData(GridData.FILL_HORIZONTAL);
		clientId.setLayoutData(clientIdData);
		clientId.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.clientId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clientId.getText()));
			}

		});
		clientId.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.clientId, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, clientId.getText()));
				}
			}

		});
		EditingUtils.setID(clientId, EsbViewsRepository.InboundEndpoint.Properties.clientId);
		EditingUtils.setEEFtype(clientId, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.clientId, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClientIdText

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperSessionTimeoutMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperSessionTimeoutMsLabel);
		zookeeperSessionTimeoutMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData zookeeperSessionTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperSessionTimeoutMs.setLayoutData(zookeeperSessionTimeoutMsData);
		zookeeperSessionTimeoutMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSessionTimeoutMs.getText()));
			}

		});
		zookeeperSessionTimeoutMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSessionTimeoutMs.getText()));
				}
			}

		});
		EditingUtils.setID(zookeeperSessionTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs);
		EditingUtils.setEEFtype(zookeeperSessionTimeoutMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperSessionTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperConnectionTimeoutMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperConnectionTimeoutMsLabel);
		zookeeperConnectionTimeoutMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData zookeeperConnectionTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperConnectionTimeoutMs.setLayoutData(zookeeperConnectionTimeoutMsData);
		zookeeperConnectionTimeoutMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnectionTimeoutMs.getText()));
			}

		});
		zookeeperConnectionTimeoutMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperConnectionTimeoutMs.getText()));
				}
			}

		});
		EditingUtils.setID(zookeeperConnectionTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs);
		EditingUtils.setEEFtype(zookeeperConnectionTimeoutMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperConnectionTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createZookeeperSyncTimeMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, EsbMessages.InboundEndpointPropertiesEditionPart_ZookeeperSyncTimeMsLabel);
		zookeeperSyncTimeMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData zookeeperSyncTimeMsData = new GridData(GridData.FILL_HORIZONTAL);
		zookeeperSyncTimeMs.setLayoutData(zookeeperSyncTimeMsData);
		zookeeperSyncTimeMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSyncTimeMs.getText()));
			}

		});
		zookeeperSyncTimeMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, zookeeperSyncTimeMs.getText()));
				}
			}

		});
		EditingUtils.setID(zookeeperSyncTimeMs, EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs);
		EditingUtils.setEEFtype(zookeeperSyncTimeMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createZookeeperSyncTimeMsText

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsStorageEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsStorageLabel);
		offsetsStorage = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		offsetsStorage.setContentProvider(new ArrayContentProvider());
		offsetsStorage.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData offsetsStorageData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsStorage.getCombo().setLayoutData(offsetsStorageData);
		offsetsStorage.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOffsetsStorage()));
			}

		});
		offsetsStorage.setID(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsStorageEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsChannelBackoffMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsChannelBackoffMsLabel);
		offsetsChannelBackoffMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData offsetsChannelBackoffMsData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsChannelBackoffMs.setLayoutData(offsetsChannelBackoffMsData);
		offsetsChannelBackoffMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelBackoffMs.getText()));
			}

		});
		offsetsChannelBackoffMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelBackoffMs.getText()));
				}
			}

		});
		EditingUtils.setID(offsetsChannelBackoffMs, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs);
		EditingUtils.setEEFtype(offsetsChannelBackoffMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsChannelBackoffMsText

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsChannelSocketTimeoutMsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsChannelSocketTimeoutMsLabel);
		offsetsChannelSocketTimeoutMs = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData offsetsChannelSocketTimeoutMsData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsChannelSocketTimeoutMs.setLayoutData(offsetsChannelSocketTimeoutMsData);
		offsetsChannelSocketTimeoutMs.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelSocketTimeoutMs.getText()));
			}

		});
		offsetsChannelSocketTimeoutMs.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsChannelSocketTimeoutMs.getText()));
				}
			}

		});
		EditingUtils.setID(offsetsChannelSocketTimeoutMs, EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs);
		EditingUtils.setEEFtype(offsetsChannelSocketTimeoutMs, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsChannelSocketTimeoutMsText

		// End of user code
		return parent;
	}

	
	protected Composite createOffsetsCommitMaxRetriesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, EsbMessages.InboundEndpointPropertiesEditionPart_OffsetsCommitMaxRetriesLabel);
		offsetsCommitMaxRetries = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData offsetsCommitMaxRetriesData = new GridData(GridData.FILL_HORIZONTAL);
		offsetsCommitMaxRetries.setLayoutData(offsetsCommitMaxRetriesData);
		offsetsCommitMaxRetries.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsCommitMaxRetries.getText()));
			}

		});
		offsetsCommitMaxRetries.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, offsetsCommitMaxRetries.getText()));
				}
			}

		});
		EditingUtils.setID(offsetsCommitMaxRetries, EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries);
		EditingUtils.setEEFtype(offsetsCommitMaxRetries, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOffsetsCommitMaxRetriesText

		// End of user code
		return parent;
	}

	
	protected Composite createDualCommitEnabledCheckbox(Composite parent) {
		dualCommitEnabled = new Button(parent, SWT.CHECK);
		dualCommitEnabled.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_DualCommitEnabledLabel));
		dualCommitEnabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(dualCommitEnabled.getSelection())));
			}

		});
		GridData dualCommitEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		dualCommitEnabledData.horizontalSpan = 2;
		dualCommitEnabled.setLayoutData(dualCommitEnabledData);
		EditingUtils.setID(dualCommitEnabled, EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled);
		EditingUtils.setEEFtype(dualCommitEnabled, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDualCommitEnabledCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInboundCxfRmHostText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, EsbMessages.InboundEndpointPropertiesEditionPart_InboundCxfRmHostLabel);
		inboundCxfRmHost = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundCxfRmHostData = new GridData(GridData.FILL_HORIZONTAL);
		inboundCxfRmHost.setLayoutData(inboundCxfRmHostData);
		inboundCxfRmHost.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmHost.getText()));
			}

		});
		inboundCxfRmHost.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmHost.getText()));
				}
			}

		});
		EditingUtils.setID(inboundCxfRmHost, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost);
		EditingUtils.setEEFtype(inboundCxfRmHost, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundCxfRmHostText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundCxfRmPortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, EsbMessages.InboundEndpointPropertiesEditionPart_InboundCxfRmPortLabel);
		inboundCxfRmPort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundCxfRmPortData = new GridData(GridData.FILL_HORIZONTAL);
		inboundCxfRmPort.setLayoutData(inboundCxfRmPortData);
		inboundCxfRmPort.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmPort.getText()));
			}

		});
		inboundCxfRmPort.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmPort.getText()));
				}
			}

		});
		EditingUtils.setID(inboundCxfRmPort, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort);
		EditingUtils.setEEFtype(inboundCxfRmPort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundCxfRmPortText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundCxfRmConfigFileText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, EsbMessages.InboundEndpointPropertiesEditionPart_InboundCxfRmConfigFileLabel);
		inboundCxfRmConfigFile = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData inboundCxfRmConfigFileData = new GridData(GridData.FILL_HORIZONTAL);
		inboundCxfRmConfigFile.setLayoutData(inboundCxfRmConfigFileData);
		inboundCxfRmConfigFile.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmConfigFile.getText()));
			}

		});
		inboundCxfRmConfigFile.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, inboundCxfRmConfigFile.getText()));
				}
			}

		});
		EditingUtils.setID(inboundCxfRmConfigFile, EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile);
		EditingUtils.setEEFtype(inboundCxfRmConfigFile, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundCxfRmConfigFileText

		// End of user code
		return parent;
	}

	
	protected Composite createEnableSSLCheckbox(Composite parent) {
		enableSSL = new Button(parent, SWT.CHECK);
		enableSSL.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.enableSSL, EsbMessages.InboundEndpointPropertiesEditionPart_EnableSSLLabel));
		enableSSL.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.enableSSL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(enableSSL.getSelection())));
			}

		});
		GridData enableSSLData = new GridData(GridData.FILL_HORIZONTAL);
		enableSSLData.horizontalSpan = 2;
		enableSSL.setLayoutData(enableSSLData);
		EditingUtils.setID(enableSSL, EsbViewsRepository.InboundEndpoint.Properties.enableSSL);
		EditingUtils.setEEFtype(enableSSL, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.enableSSL, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEnableSSLCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createServiceParametersAdvancedTableComposition(Composite parent) {
		this.serviceParameters = new ReferencesTable(getDescription(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, EsbMessages.InboundEndpointPropertiesEditionPart_ServiceParametersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				serviceParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				serviceParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				serviceParameters.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				serviceParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.serviceParametersFilters) {
			this.serviceParameters.addFilter(filter);
		}
		this.serviceParameters.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, EsbViewsRepository.SWT_KIND));
		this.serviceParameters.createControls(parent);
		this.serviceParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.serviceParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData serviceParametersData = new GridData(GridData.FILL_HORIZONTAL);
		serviceParametersData.horizontalSpan = 3;
		this.serviceParameters.setLayoutData(serviceParametersData);
		this.serviceParameters.setLowerBound(0);
		this.serviceParameters.setUpperBound(-1);
		serviceParameters.setID(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters);
		serviceParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createServiceParametersAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createSuspendCheckbox(Composite parent) {
		suspend = new Button(parent, SWT.CHECK);
		suspend.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.suspend, EsbMessages.InboundEndpointPropertiesEditionPart_SuspendLabel));
		suspend.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.suspend, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(suspend.getSelection())));
			}

		});
		GridData suspendData = new GridData(GridData.FILL_HORIZONTAL);
		suspendData.horizontalSpan = 2;
		suspend.setLayoutData(suspendData);
		EditingUtils.setID(suspend, EsbViewsRepository.InboundEndpoint.Properties.suspend);
		EditingUtils.setEEFtype(suspend, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.suspend, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSuspendCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionFactoryText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionFactoryLabel);
		transportRabbitMqConnectionFactory = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionFactoryData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionFactory.setLayoutData(transportRabbitMqConnectionFactoryData);
		transportRabbitMqConnectionFactory.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionFactory.getText()));
			}

		});
		transportRabbitMqConnectionFactory.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionFactory.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionFactory, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory);
		EditingUtils.setEEFtype(transportRabbitMqConnectionFactory, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionFactoryText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerHostNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerHostNameLabel);
		transportRabbitMqServerHostName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqServerHostNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerHostName.setLayoutData(transportRabbitMqServerHostNameData);
		transportRabbitMqServerHostName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerHostName.getText()));
			}

		});
		transportRabbitMqServerHostName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerHostName.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqServerHostName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName);
		EditingUtils.setEEFtype(transportRabbitMqServerHostName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerHostNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerPortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerPortLabel);
		transportRabbitMqServerPort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqServerPortData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerPort.setLayoutData(transportRabbitMqServerPortData);
		transportRabbitMqServerPort.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPort.getText()));
			}

		});
		transportRabbitMqServerPort.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPort.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqServerPort, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort);
		EditingUtils.setEEFtype(transportRabbitMqServerPort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerPortText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerUserNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerUserNameLabel);
		transportRabbitMqServerUserName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqServerUserNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerUserName.setLayoutData(transportRabbitMqServerUserNameData);
		transportRabbitMqServerUserName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerUserName.getText()));
			}

		});
		transportRabbitMqServerUserName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerUserName.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqServerUserName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName);
		EditingUtils.setEEFtype(transportRabbitMqServerUserName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerUserNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerPasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerPasswordLabel);
		transportRabbitMqServerPassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqServerPasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerPassword.setLayoutData(transportRabbitMqServerPasswordData);
		transportRabbitMqServerPassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPassword.getText()));
			}

		});
		transportRabbitMqServerPassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerPassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqServerPassword, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword);
		EditingUtils.setEEFtype(transportRabbitMqServerPassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerPasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueNameLabel);
		transportRabbitMqQueueName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueName.setLayoutData(transportRabbitMqQueueNameData);
		transportRabbitMqQueueName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueName.getText()));
			}

		});
		transportRabbitMqQueueName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueName.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName);
		EditingUtils.setEEFtype(transportRabbitMqQueueName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeNameLabel);
		transportRabbitMqExchangeName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqExchangeNameData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeName.setLayoutData(transportRabbitMqExchangeNameData);
		transportRabbitMqExchangeName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeName.getText()));
			}

		});
		transportRabbitMqExchangeName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeName.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqExchangeName, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName);
		EditingUtils.setEEFtype(transportRabbitMqExchangeName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueDurableText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueDurableLabel);
		transportRabbitMqQueueDurable = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueDurableData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueDurable.setLayoutData(transportRabbitMqQueueDurableData);
		transportRabbitMqQueueDurable.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDurable.getText()));
			}

		});
		transportRabbitMqQueueDurable.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDurable.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueDurable, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable);
		EditingUtils.setEEFtype(transportRabbitMqQueueDurable, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueDurableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueExclusiveText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueExclusiveLabel);
		transportRabbitMqQueueExclusive = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueExclusiveData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueExclusive.setLayoutData(transportRabbitMqQueueExclusiveData);
		transportRabbitMqQueueExclusive.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueExclusive.getText()));
			}

		});
		transportRabbitMqQueueExclusive.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueExclusive.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueExclusive, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive);
		EditingUtils.setEEFtype(transportRabbitMqQueueExclusive, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueExclusiveText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueAutoDeleteText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueAutoDeleteLabel);
		transportRabbitMqQueueAutoDelete = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueAutoDeleteData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueAutoDelete.setLayoutData(transportRabbitMqQueueAutoDeleteData);
		transportRabbitMqQueueAutoDelete.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoDelete.getText()));
			}

		});
		transportRabbitMqQueueAutoDelete.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoDelete.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueAutoDelete, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete);
		EditingUtils.setEEFtype(transportRabbitMqQueueAutoDelete, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueAutoDeleteText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueAutoAckText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueAutoAckLabel);
		transportRabbitMqQueueAutoAck = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueAutoAckData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueAutoAck.setLayoutData(transportRabbitMqQueueAutoAckData);
		transportRabbitMqQueueAutoAck.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoAck.getText()));
			}

		});
		transportRabbitMqQueueAutoAck.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueAutoAck.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueAutoAck, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck);
		EditingUtils.setEEFtype(transportRabbitMqQueueAutoAck, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueAutoAckText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueRoutingKeyText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueRoutingKeyLabel);
		transportRabbitMqQueueRoutingKey = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueRoutingKeyData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueRoutingKey.setLayoutData(transportRabbitMqQueueRoutingKeyData);
		transportRabbitMqQueueRoutingKey.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueRoutingKey.getText()));
			}

		});
		transportRabbitMqQueueRoutingKey.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueRoutingKey.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueRoutingKey, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey);
		EditingUtils.setEEFtype(transportRabbitMqQueueRoutingKey, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueRoutingKeyText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqQueueDeliveryModeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqQueueDeliveryModeLabel);
		transportRabbitMqQueueDeliveryMode = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqQueueDeliveryModeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqQueueDeliveryMode.setLayoutData(transportRabbitMqQueueDeliveryModeData);
		transportRabbitMqQueueDeliveryMode.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDeliveryMode.getText()));
			}

		});
		transportRabbitMqQueueDeliveryMode.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqQueueDeliveryMode.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqQueueDeliveryMode, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode);
		EditingUtils.setEEFtype(transportRabbitMqQueueDeliveryMode, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqQueueDeliveryModeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeTypeLabel);
		transportRabbitMqExchangeType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqExchangeTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeType.setLayoutData(transportRabbitMqExchangeTypeData);
		transportRabbitMqExchangeType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeType.getText()));
			}

		});
		transportRabbitMqExchangeType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeType.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqExchangeType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType);
		EditingUtils.setEEFtype(transportRabbitMqExchangeType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeDurableText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeDurableLabel);
		transportRabbitMqExchangeDurable = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqExchangeDurableData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeDurable.setLayoutData(transportRabbitMqExchangeDurableData);
		transportRabbitMqExchangeDurable.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeDurable.getText()));
			}

		});
		transportRabbitMqExchangeDurable.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeDurable.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqExchangeDurable, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable);
		EditingUtils.setEEFtype(transportRabbitMqExchangeDurable, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeDurableText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqExchangeAutoDeleteText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqExchangeAutoDeleteLabel);
		transportRabbitMqExchangeAutoDelete = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqExchangeAutoDeleteData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqExchangeAutoDelete.setLayoutData(transportRabbitMqExchangeAutoDeleteData);
		transportRabbitMqExchangeAutoDelete.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeAutoDelete.getText()));
			}

		});
		transportRabbitMqExchangeAutoDelete.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqExchangeAutoDelete.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqExchangeAutoDelete, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete);
		EditingUtils.setEEFtype(transportRabbitMqExchangeAutoDelete, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqExchangeAutoDeleteText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerVirtualHostText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerVirtualHostLabel);
		transportRabbitMqServerVirtualHost = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqServerVirtualHostData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerVirtualHost.setLayoutData(transportRabbitMqServerVirtualHostData);
		transportRabbitMqServerVirtualHost.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerVirtualHost.getText()));
			}

		});
		transportRabbitMqServerVirtualHost.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerVirtualHost.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqServerVirtualHost, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost);
		EditingUtils.setEEFtype(transportRabbitMqServerVirtualHost, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerVirtualHostText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqFactoryHeartbeatText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqFactoryHeartbeatLabel);
		transportRabbitMqFactoryHeartbeat = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqFactoryHeartbeatData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqFactoryHeartbeat.setLayoutData(transportRabbitMqFactoryHeartbeatData);
		transportRabbitMqFactoryHeartbeat.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqFactoryHeartbeat.getText()));
			}

		});
		transportRabbitMqFactoryHeartbeat.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqFactoryHeartbeat.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqFactoryHeartbeat, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat);
		EditingUtils.setEEFtype(transportRabbitMqFactoryHeartbeat, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqFactoryHeartbeatText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslEnabledText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslEnabledLabel);
		transportRabbitMqConnectionSslEnabled = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslEnabled.setLayoutData(transportRabbitMqConnectionSslEnabledData);
		transportRabbitMqConnectionSslEnabled.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslEnabled.getText()));
			}

		});
		transportRabbitMqConnectionSslEnabled.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslEnabled.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslEnabled, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslEnabled, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslEnabledText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslKeystoreLocationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslKeystoreLocationLabel);
		transportRabbitMqConnectionSslKeystoreLocation = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslKeystoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslKeystoreLocation.setLayoutData(transportRabbitMqConnectionSslKeystoreLocationData);
		transportRabbitMqConnectionSslKeystoreLocation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreLocation.getText()));
			}

		});
		transportRabbitMqConnectionSslKeystoreLocation.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreLocation.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslKeystoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslKeystoreLocation, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslKeystoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslKeystoreTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslKeystoreTypeLabel);
		transportRabbitMqConnectionSslKeystoreType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslKeystoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslKeystoreType.setLayoutData(transportRabbitMqConnectionSslKeystoreTypeData);
		transportRabbitMqConnectionSslKeystoreType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreType.getText()));
			}

		});
		transportRabbitMqConnectionSslKeystoreType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystoreType.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslKeystoreType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslKeystoreType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslKeystoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslKeystorePasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslKeystorePasswordLabel);
		transportRabbitMqConnectionSslKeystorePassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslKeystorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslKeystorePassword.setLayoutData(transportRabbitMqConnectionSslKeystorePasswordData);
		transportRabbitMqConnectionSslKeystorePassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystorePassword.getText()));
			}

		});
		transportRabbitMqConnectionSslKeystorePassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslKeystorePassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslKeystorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslKeystorePassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslKeystorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslTruststoreLocationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslTruststoreLocationLabel);
		transportRabbitMqConnectionSslTruststoreLocation = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslTruststoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslTruststoreLocation.setLayoutData(transportRabbitMqConnectionSslTruststoreLocationData);
		transportRabbitMqConnectionSslTruststoreLocation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreLocation.getText()));
			}

		});
		transportRabbitMqConnectionSslTruststoreLocation.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreLocation.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslTruststoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslTruststoreLocation, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslTruststoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslTruststoreTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslTruststoreTypeLabel);
		transportRabbitMqConnectionSslTruststoreType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslTruststoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslTruststoreType.setLayoutData(transportRabbitMqConnectionSslTruststoreTypeData);
		transportRabbitMqConnectionSslTruststoreType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreType.getText()));
			}

		});
		transportRabbitMqConnectionSslTruststoreType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststoreType.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslTruststoreType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslTruststoreType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslTruststoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslTruststorePasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslTruststorePasswordLabel);
		transportRabbitMqConnectionSslTruststorePassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslTruststorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslTruststorePassword.setLayoutData(transportRabbitMqConnectionSslTruststorePasswordData);
		transportRabbitMqConnectionSslTruststorePassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststorePassword.getText()));
			}

		});
		transportRabbitMqConnectionSslTruststorePassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslTruststorePassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslTruststorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslTruststorePassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslTruststorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionSslVersionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionSslVersionLabel);
		transportRabbitMqConnectionSslVersion = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionSslVersionData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionSslVersion.setLayoutData(transportRabbitMqConnectionSslVersionData);
		transportRabbitMqConnectionSslVersion.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslVersion.getText()));
			}

		});
		transportRabbitMqConnectionSslVersion.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionSslVersion.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionSslVersion, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion);
		EditingUtils.setEEFtype(transportRabbitMqConnectionSslVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionSslVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqMessageContentTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqMessageContentTypeLabel);
		transportRabbitMqMessageContentType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqMessageContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqMessageContentType.setLayoutData(transportRabbitMqMessageContentTypeData);
		transportRabbitMqMessageContentType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqMessageContentType.getText()));
			}

		});
		transportRabbitMqMessageContentType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqMessageContentType.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqMessageContentType, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType);
		EditingUtils.setEEFtype(transportRabbitMqMessageContentType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqMessageContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionRetryCountText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionRetryCountLabel);
		transportRabbitMqConnectionRetryCount = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionRetryCountData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionRetryCount.setLayoutData(transportRabbitMqConnectionRetryCountData);
		transportRabbitMqConnectionRetryCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryCount.getText()));
			}

		});
		transportRabbitMqConnectionRetryCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryCount.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionRetryCount, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount);
		EditingUtils.setEEFtype(transportRabbitMqConnectionRetryCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionRetryCountText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConnectionRetryIntervalText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConnectionRetryIntervalLabel);
		transportRabbitMqConnectionRetryInterval = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConnectionRetryIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConnectionRetryInterval.setLayoutData(transportRabbitMqConnectionRetryIntervalData);
		transportRabbitMqConnectionRetryInterval.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryInterval.getText()));
			}

		});
		transportRabbitMqConnectionRetryInterval.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConnectionRetryInterval.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConnectionRetryInterval, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval);
		EditingUtils.setEEFtype(transportRabbitMqConnectionRetryInterval, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConnectionRetryIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqServerRetryIntervalText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqServerRetryIntervalLabel);
		transportRabbitMqServerRetryInterval = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqServerRetryIntervalData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqServerRetryInterval.setLayoutData(transportRabbitMqServerRetryIntervalData);
		transportRabbitMqServerRetryInterval.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerRetryInterval.getText()));
			}

		});
		transportRabbitMqServerRetryInterval.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqServerRetryInterval.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqServerRetryInterval, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval);
		EditingUtils.setEEFtype(transportRabbitMqServerRetryInterval, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqServerRetryIntervalText

		// End of user code
		return parent;
	}

	
	protected Composite createWsInboundPortText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, EsbMessages.InboundEndpointPropertiesEditionPart_WsInboundPortLabel);
		wsInboundPort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsInboundPortData = new GridData(GridData.FILL_HORIZONTAL);
		wsInboundPort.setLayoutData(wsInboundPortData);
		wsInboundPort.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsInboundPort.getText()));
			}

		});
		wsInboundPort.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsInboundPort.getText()));
				}
			}

		});
		EditingUtils.setID(wsInboundPort, EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort);
		EditingUtils.setEEFtype(wsInboundPort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsInboundPortText

		// End of user code
		return parent;
	}

	
	protected Composite createWsClientSideBroadcastLevelEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel, EsbMessages.InboundEndpointPropertiesEditionPart_WsClientSideBroadcastLevelLabel);
		wsClientSideBroadcastLevel = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		wsClientSideBroadcastLevel.setContentProvider(new ArrayContentProvider());
		wsClientSideBroadcastLevel.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData wsClientSideBroadcastLevelData = new GridData(GridData.FILL_HORIZONTAL);
		wsClientSideBroadcastLevel.getCombo().setLayoutData(wsClientSideBroadcastLevelData);
		wsClientSideBroadcastLevel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getWsClientSideBroadcastLevel()));
			}

		});
		wsClientSideBroadcastLevel.setID(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsClientSideBroadcastLevelEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createWsOutflowDispatchSequenceText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, EsbMessages.InboundEndpointPropertiesEditionPart_WsOutflowDispatchSequenceLabel);
		wsOutflowDispatchSequence = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsOutflowDispatchSequenceData = new GridData(GridData.FILL_HORIZONTAL);
		wsOutflowDispatchSequence.setLayoutData(wsOutflowDispatchSequenceData);
		wsOutflowDispatchSequence.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchSequence.getText()));
			}

		});
		wsOutflowDispatchSequence.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchSequence.getText()));
				}
			}

		});
		EditingUtils.setID(wsOutflowDispatchSequence, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence);
		EditingUtils.setEEFtype(wsOutflowDispatchSequence, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsOutflowDispatchSequenceText

		// End of user code
		return parent;
	}

	
	protected Composite createWsOutflowDispatchFaultSequenceText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, EsbMessages.InboundEndpointPropertiesEditionPart_WsOutflowDispatchFaultSequenceLabel);
		wsOutflowDispatchFaultSequence = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsOutflowDispatchFaultSequenceData = new GridData(GridData.FILL_HORIZONTAL);
		wsOutflowDispatchFaultSequence.setLayoutData(wsOutflowDispatchFaultSequenceData);
		wsOutflowDispatchFaultSequence.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchFaultSequence.getText()));
			}

		});
		wsOutflowDispatchFaultSequence.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsOutflowDispatchFaultSequence.getText()));
				}
			}

		});
		EditingUtils.setID(wsOutflowDispatchFaultSequence, EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence);
		EditingUtils.setEEFtype(wsOutflowDispatchFaultSequence, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsOutflowDispatchFaultSequenceText

		// End of user code
		return parent;
	}

	
	protected Composite createWsBossThreadPoolSizeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, EsbMessages.InboundEndpointPropertiesEditionPart_WsBossThreadPoolSizeLabel);
		wsBossThreadPoolSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsBossThreadPoolSizeData = new GridData(GridData.FILL_HORIZONTAL);
		wsBossThreadPoolSize.setLayoutData(wsBossThreadPoolSizeData);
		wsBossThreadPoolSize.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsBossThreadPoolSize.getText()));
			}

		});
		wsBossThreadPoolSize.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsBossThreadPoolSize.getText()));
				}
			}

		});
		EditingUtils.setID(wsBossThreadPoolSize, EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize);
		EditingUtils.setEEFtype(wsBossThreadPoolSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsBossThreadPoolSizeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsWorkerThreadPoolSizeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, EsbMessages.InboundEndpointPropertiesEditionPart_WsWorkerThreadPoolSizeLabel);
		wsWorkerThreadPoolSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsWorkerThreadPoolSizeData = new GridData(GridData.FILL_HORIZONTAL);
		wsWorkerThreadPoolSize.setLayoutData(wsWorkerThreadPoolSizeData);
		wsWorkerThreadPoolSize.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsWorkerThreadPoolSize.getText()));
			}

		});
		wsWorkerThreadPoolSize.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsWorkerThreadPoolSize.getText()));
				}
			}

		});
		EditingUtils.setID(wsWorkerThreadPoolSize, EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize);
		EditingUtils.setEEFtype(wsWorkerThreadPoolSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsWorkerThreadPoolSizeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsSubprotocolHandlerClassText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, EsbMessages.InboundEndpointPropertiesEditionPart_WsSubprotocolHandlerClassLabel);
		wsSubprotocolHandlerClass = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsSubprotocolHandlerClassData = new GridData(GridData.FILL_HORIZONTAL);
		wsSubprotocolHandlerClass.setLayoutData(wsSubprotocolHandlerClassData);
		wsSubprotocolHandlerClass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsSubprotocolHandlerClass.getText()));
			}

		});
		wsSubprotocolHandlerClass.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsSubprotocolHandlerClass.getText()));
				}
			}

		});
		EditingUtils.setID(wsSubprotocolHandlerClass, EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass);
		EditingUtils.setEEFtype(wsSubprotocolHandlerClass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsSubprotocolHandlerClassText

		// End of user code
		return parent;
	}

	
	protected Composite createWsPipelineHandlerClassText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, EsbMessages.InboundEndpointPropertiesEditionPart_WsPipelineHandlerClassLabel);
		wsPipelineHandlerClass = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsPipelineHandlerClassData = new GridData(GridData.FILL_HORIZONTAL);
		wsPipelineHandlerClass.setLayoutData(wsPipelineHandlerClassData);
		wsPipelineHandlerClass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsPipelineHandlerClass.getText()));
			}

		});
		wsPipelineHandlerClass.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsPipelineHandlerClass.getText()));
				}
			}

		});
		EditingUtils.setID(wsPipelineHandlerClass, EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass);
		EditingUtils.setEEFtype(wsPipelineHandlerClass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsPipelineHandlerClassText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportFeedURLText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, EsbMessages.InboundEndpointPropertiesEditionPart_TransportFeedURLLabel);
		transportFeedURL = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportFeedURLData = new GridData(GridData.FILL_HORIZONTAL);
		transportFeedURL.setLayoutData(transportFeedURLData);
		transportFeedURL.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportFeedURL.getText()));
			}

		});
		transportFeedURL.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportFeedURL.getText()));
				}
			}

		});
		EditingUtils.setID(transportFeedURL, EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL);
		EditingUtils.setEEFtype(transportFeedURL, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportFeedURLText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportFeedTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportFeedType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportFeedTypeLabel);
		transportFeedType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportFeedType.setContentProvider(new ArrayContentProvider());
		transportFeedType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportFeedTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportFeedType.getCombo().setLayoutData(transportFeedTypeData);
		transportFeedType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportFeedType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportFeedType()));
			}

		});
		transportFeedType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportFeedTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTraceEnabledCheckbox(Composite parent) {
		traceEnabled = new Button(parent, SWT.CHECK);
		traceEnabled.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_TraceEnabledLabel));
		traceEnabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.traceEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(traceEnabled.getSelection())));
			}

		});
		GridData traceEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		traceEnabledData.horizontalSpan = 2;
		traceEnabled.setLayoutData(traceEnabledData);
		EditingUtils.setID(traceEnabled, EsbViewsRepository.InboundEndpoint.Properties.traceEnabled);
		EditingUtils.setEEFtype(traceEnabled, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTraceEnabledCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createStatisticsEnabledCheckbox(Composite parent) {
		statisticsEnabled = new Button(parent, SWT.CHECK);
		statisticsEnabled.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled, EsbMessages.InboundEndpointPropertiesEditionPart_StatisticsEnabledLabel));
		statisticsEnabled.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(statisticsEnabled.getSelection())));
			}

		});
		GridData statisticsEnabledData = new GridData(GridData.FILL_HORIZONTAL);
		statisticsEnabledData.horizontalSpan = 2;
		statisticsEnabled.setLayoutData(statisticsEnabledData);
		EditingUtils.setID(statisticsEnabled, EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled);
		EditingUtils.setEEFtype(statisticsEnabled, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStatisticsEnabledCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSRetriesBeforeSuspensionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSRetriesBeforeSuspensionLabel);
		transportJMSRetriesBeforeSuspension = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSRetriesBeforeSuspensionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSRetriesBeforeSuspension.setLayoutData(transportJMSRetriesBeforeSuspensionData);
		transportJMSRetriesBeforeSuspension.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetriesBeforeSuspension.getText()));
			}

		});
		transportJMSRetriesBeforeSuspension.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSRetriesBeforeSuspension.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSRetriesBeforeSuspension, EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension);
		EditingUtils.setEEFtype(transportJMSRetriesBeforeSuspension, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSRetriesBeforeSuspensionText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSResetConnectionOnPollingSuspensionCheckbox(Composite parent) {
		transportJMSResetConnectionOnPollingSuspension = new Button(parent, SWT.CHECK);
		transportJMSResetConnectionOnPollingSuspension.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSResetConnectionOnPollingSuspensionLabel));
		transportJMSResetConnectionOnPollingSuspension.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(transportJMSResetConnectionOnPollingSuspension.getSelection())));
			}

		});
		GridData transportJMSResetConnectionOnPollingSuspensionData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSResetConnectionOnPollingSuspensionData.horizontalSpan = 2;
		transportJMSResetConnectionOnPollingSuspension.setLayoutData(transportJMSResetConnectionOnPollingSuspensionData);
		EditingUtils.setID(transportJMSResetConnectionOnPollingSuspension, EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension);
		EditingUtils.setEEFtype(transportJMSResetConnectionOnPollingSuspension, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSResetConnectionOnPollingSuspensionCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSPollingSuspensionPeriodText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSPollingSuspensionPeriodLabel);
		transportJMSPollingSuspensionPeriod = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSPollingSuspensionPeriodData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSPollingSuspensionPeriod.setLayoutData(transportJMSPollingSuspensionPeriodData);
		transportJMSPollingSuspensionPeriod.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPollingSuspensionPeriod.getText()));
			}

		});
		transportJMSPollingSuspensionPeriod.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSPollingSuspensionPeriod.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSPollingSuspensionPeriod, EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod);
		EditingUtils.setEEFtype(transportJMSPollingSuspensionPeriod, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSPollingSuspensionPeriodText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslKeystoreLocationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslKeystoreLocationLabel);
		transportMQTTSslKeystoreLocation = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslKeystoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslKeystoreLocation.setLayoutData(transportMQTTSslKeystoreLocationData);
		transportMQTTSslKeystoreLocation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreLocation.getText()));
			}

		});
		transportMQTTSslKeystoreLocation.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreLocation.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslKeystoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation);
		EditingUtils.setEEFtype(transportMQTTSslKeystoreLocation, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslKeystoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslKeystoreTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslKeystoreTypeLabel);
		transportMQTTSslKeystoreType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslKeystoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslKeystoreType.setLayoutData(transportMQTTSslKeystoreTypeData);
		transportMQTTSslKeystoreType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreType.getText()));
			}

		});
		transportMQTTSslKeystoreType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystoreType.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslKeystoreType, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType);
		EditingUtils.setEEFtype(transportMQTTSslKeystoreType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslKeystoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslKeystorePasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslKeystorePasswordLabel);
		transportMQTTSslKeystorePassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslKeystorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslKeystorePassword.setLayoutData(transportMQTTSslKeystorePasswordData);
		transportMQTTSslKeystorePassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystorePassword.getText()));
			}

		});
		transportMQTTSslKeystorePassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslKeystorePassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslKeystorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword);
		EditingUtils.setEEFtype(transportMQTTSslKeystorePassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslKeystorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslTruststoreLocationText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslTruststoreLocationLabel);
		transportMQTTSslTruststoreLocation = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslTruststoreLocationData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslTruststoreLocation.setLayoutData(transportMQTTSslTruststoreLocationData);
		transportMQTTSslTruststoreLocation.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreLocation.getText()));
			}

		});
		transportMQTTSslTruststoreLocation.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreLocation.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslTruststoreLocation, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation);
		EditingUtils.setEEFtype(transportMQTTSslTruststoreLocation, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslTruststoreLocationText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslTruststoreTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslTruststoreTypeLabel);
		transportMQTTSslTruststoreType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslTruststoreTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslTruststoreType.setLayoutData(transportMQTTSslTruststoreTypeData);
		transportMQTTSslTruststoreType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreType.getText()));
			}

		});
		transportMQTTSslTruststoreType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststoreType.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslTruststoreType, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType);
		EditingUtils.setEEFtype(transportMQTTSslTruststoreType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslTruststoreTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslTruststorePasswordText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslTruststorePasswordLabel);
		transportMQTTSslTruststorePassword = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslTruststorePasswordData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslTruststorePassword.setLayoutData(transportMQTTSslTruststorePasswordData);
		transportMQTTSslTruststorePassword.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststorePassword.getText()));
			}

		});
		transportMQTTSslTruststorePassword.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslTruststorePassword.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslTruststorePassword, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword);
		EditingUtils.setEEFtype(transportMQTTSslTruststorePassword, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslTruststorePasswordText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportMQTTSslVersionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, EsbMessages.InboundEndpointPropertiesEditionPart_TransportMQTTSslVersionLabel);
		transportMQTTSslVersion = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportMQTTSslVersionData = new GridData(GridData.FILL_HORIZONTAL);
		transportMQTTSslVersion.setLayoutData(transportMQTTSslVersionData);
		transportMQTTSslVersion.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslVersion.getText()));
			}

		});
		transportMQTTSslVersion.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportMQTTSslVersion.getText()));
				}
			}

		});
		EditingUtils.setID(transportMQTTSslVersion, EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion);
		EditingUtils.setEEFtype(transportMQTTSslVersion, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportMQTTSslVersionText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslKeyStoreFileText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslKeyStoreFileLabel);
		wssSslKeyStoreFile = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslKeyStoreFileData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslKeyStoreFile.setLayoutData(wssSslKeyStoreFileData);
		wssSslKeyStoreFile.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStoreFile.getText()));
			}

		});
		wssSslKeyStoreFile.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStoreFile.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslKeyStoreFile, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile);
		EditingUtils.setEEFtype(wssSslKeyStoreFile, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslKeyStoreFileText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslKeyStorePassText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslKeyStorePassLabel);
		wssSslKeyStorePass = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslKeyStorePassData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslKeyStorePass.setLayoutData(wssSslKeyStorePassData);
		wssSslKeyStorePass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStorePass.getText()));
			}

		});
		wssSslKeyStorePass.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslKeyStorePass.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslKeyStorePass, EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass);
		EditingUtils.setEEFtype(wssSslKeyStorePass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslKeyStorePassText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslTrustStoreFileText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslTrustStoreFileLabel);
		wssSslTrustStoreFile = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslTrustStoreFileData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslTrustStoreFile.setLayoutData(wssSslTrustStoreFileData);
		wssSslTrustStoreFile.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStoreFile.getText()));
			}

		});
		wssSslTrustStoreFile.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStoreFile.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslTrustStoreFile, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile);
		EditingUtils.setEEFtype(wssSslTrustStoreFile, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslTrustStoreFileText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslTrustStorePassText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslTrustStorePassLabel);
		wssSslTrustStorePass = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslTrustStorePassData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslTrustStorePass.setLayoutData(wssSslTrustStorePassData);
		wssSslTrustStorePass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStorePass.getText()));
			}

		});
		wssSslTrustStorePass.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslTrustStorePass.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslTrustStorePass, EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass);
		EditingUtils.setEEFtype(wssSslTrustStorePass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslTrustStorePassText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslCertPassText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslCertPassLabel);
		wssSslCertPass = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslCertPassData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslCertPass.setLayoutData(wssSslCertPassData);
		wssSslCertPass.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCertPass.getText()));
			}

		});
		wssSslCertPass.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCertPass.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslCertPass, EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass);
		EditingUtils.setEEFtype(wssSslCertPass, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslCertPassText

		// End of user code
		return parent;
	}

	
	protected Composite createWsDefaultContentTypeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, EsbMessages.InboundEndpointPropertiesEditionPart_WsDefaultContentTypeLabel);
		wsDefaultContentType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsDefaultContentTypeData = new GridData(GridData.FILL_HORIZONTAL);
		wsDefaultContentType.setLayoutData(wsDefaultContentTypeData);
		wsDefaultContentType.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsDefaultContentType.getText()));
			}

		});
		wsDefaultContentType.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsDefaultContentType.getText()));
				}
			}

		});
		EditingUtils.setID(wsDefaultContentType, EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType);
		EditingUtils.setEEFtype(wsDefaultContentType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsDefaultContentTypeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsShutdownStatusCodeText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, EsbMessages.InboundEndpointPropertiesEditionPart_WsShutdownStatusCodeLabel);
		wsShutdownStatusCode = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsShutdownStatusCodeData = new GridData(GridData.FILL_HORIZONTAL);
		wsShutdownStatusCode.setLayoutData(wsShutdownStatusCodeData);
		wsShutdownStatusCode.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusCode.getText()));
			}

		});
		wsShutdownStatusCode.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusCode.getText()));
				}
			}

		});
		EditingUtils.setID(wsShutdownStatusCode, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode);
		EditingUtils.setEEFtype(wsShutdownStatusCode, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsShutdownStatusCodeText

		// End of user code
		return parent;
	}

	
	protected Composite createWsShutdownStatusMessageText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, EsbMessages.InboundEndpointPropertiesEditionPart_WsShutdownStatusMessageLabel);
		wsShutdownStatusMessage = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wsShutdownStatusMessageData = new GridData(GridData.FILL_HORIZONTAL);
		wsShutdownStatusMessage.setLayoutData(wsShutdownStatusMessageData);
		wsShutdownStatusMessage.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusMessage.getText()));
			}

		});
		wsShutdownStatusMessage.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wsShutdownStatusMessage.getText()));
				}
			}

		});
		EditingUtils.setID(wsShutdownStatusMessage, EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage);
		EditingUtils.setEEFtype(wsShutdownStatusMessage, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsShutdownStatusMessageText

		// End of user code
		return parent;
	}

	
	protected Composite createWsUsePortOffsetCheckbox(Composite parent) {
		wsUsePortOffset = new Button(parent, SWT.CHECK);
		wsUsePortOffset.setText(getDescription(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset, EsbMessages.InboundEndpointPropertiesEditionPart_WsUsePortOffsetLabel));
		wsUsePortOffset.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(wsUsePortOffset.getSelection())));
			}

		});
		GridData wsUsePortOffsetData = new GridData(GridData.FILL_HORIZONTAL);
		wsUsePortOffsetData.horizontalSpan = 2;
		wsUsePortOffset.setLayoutData(wsUsePortOffsetData);
		EditingUtils.setID(wsUsePortOffset, EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset);
		EditingUtils.setEEFtype(wsUsePortOffset, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWsUsePortOffsetCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslProtocolsText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslProtocolsLabel);
		wssSslProtocols = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslProtocolsData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslProtocols.setLayoutData(wssSslProtocolsData);
		wssSslProtocols.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslProtocols.getText()));
			}

		});
		wssSslProtocols.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslProtocols.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslProtocols, EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols);
		EditingUtils.setEEFtype(wssSslProtocols, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslProtocolsText

		// End of user code
		return parent;
	}

	
	protected Composite createWssSslCipherSuitesText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, EsbMessages.InboundEndpointPropertiesEditionPart_WssSslCipherSuitesLabel);
		wssSslCipherSuites = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData wssSslCipherSuitesData = new GridData(GridData.FILL_HORIZONTAL);
		wssSslCipherSuites.setLayoutData(wssSslCipherSuitesData);
		wssSslCipherSuites.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCipherSuites.getText()));
			}

		});
		wssSslCipherSuites.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, wssSslCipherSuites.getText()));
				}
			}

		});
		EditingUtils.setID(wssSslCipherSuites, EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites);
		EditingUtils.setEEFtype(wssSslCipherSuites, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createWssSslCipherSuitesText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConsumerQosText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConsumerQosLabel);
		transportRabbitMqConsumerQos = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportRabbitMqConsumerQosData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConsumerQos.setLayoutData(transportRabbitMqConsumerQosData);
		transportRabbitMqConsumerQos.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConsumerQos.getText()));
			}

		});
		transportRabbitMqConsumerQos.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportRabbitMqConsumerQos.getText()));
				}
			}

		});
		EditingUtils.setID(transportRabbitMqConsumerQos, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos);
		EditingUtils.setEEFtype(transportRabbitMqConsumerQos, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConsumerQosText

		// End of user code
		return parent;
	}

	
	protected Composite createTransportRabbitMqConsumerQosTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType, EsbMessages.InboundEndpointPropertiesEditionPart_TransportRabbitMqConsumerQosTypeLabel);
		transportRabbitMqConsumerQosType = new EMFComboViewer(parent, SWT.SCROLL_LOCK);
		transportRabbitMqConsumerQosType.setContentProvider(new ArrayContentProvider());
		transportRabbitMqConsumerQosType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transportRabbitMqConsumerQosTypeData = new GridData(GridData.FILL_HORIZONTAL);
		transportRabbitMqConsumerQosType.getCombo().setLayoutData(transportRabbitMqConsumerQosTypeData);
		transportRabbitMqConsumerQosType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransportRabbitMqConsumerQosType()));
			}

		});
		transportRabbitMqConsumerQosType.setID(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportRabbitMqConsumerQosTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createTransportJMSDBUrlText(Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, EsbMessages.InboundEndpointPropertiesEditionPart_TransportJMSDBUrlLabel);
		transportJMSDBUrl = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transportJMSDBUrlData = new GridData(GridData.FILL_HORIZONTAL);
		transportJMSDBUrl.setLayoutData(transportJMSDBUrlData);
		transportJMSDBUrl.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDBUrl.getText()));
			}

		});
		transportJMSDBUrl.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointPropertiesEditionPartImpl.this, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transportJMSDBUrl.getText()));
				}
			}

		});
		EditingUtils.setID(transportJMSDBUrl, EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl);
		EditingUtils.setEEFtype(transportJMSDBUrl, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTransportJMSDBUrlText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getCommentsList()
	 * 
	 */
	public EList getCommentsList() {
		return commentsListList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setCommentsList(EList newValue)
	 * 
	 */
	public void setCommentsList(EList newValue) {
		commentsListList = newValue;
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.commentsList);
		if (eefElementEditorReadOnlyState && commentsList.isEnabled()) {
			commentsList.setEnabled(false);
			commentsList.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commentsList.isEnabled()) {
			commentsList.setEnabled(true);
		}	
		
	}

	public void addToCommentsList(Object newValue) {
		commentsListList.add(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToCommentsList(Object newValue) {
		commentsListList.remove(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getClass_()
	 * 
	 */
	public String getClass_() {
		return class_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setClass_(String newValue)
	 * 
	 */
	public void setClass_(String newValue) {
		if (newValue != null) {
			class_.setText(newValue);
		} else {
			class_.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.class_);
		if (eefElementEditorReadOnlyState && class_.isEnabled()) {
			class_.setEnabled(false);
			class_.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !class_.isEnabled()) {
			class_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getProtocol()
	 * 
	 */
	public String getProtocol() {
		return protocol.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setProtocol(String newValue)
	 * 
	 */
	public void setProtocol(String newValue) {
		if (newValue != null) {
			protocol.setText(newValue);
		} else {
			protocol.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.protocol);
		if (eefElementEditorReadOnlyState && protocol.isEnabled()) {
			protocol.setEnabled(false);
			protocol.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protocol.isEnabled()) {
			protocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundEndpointBehaviour()
	 * 
	 */
	public Enumerator getInboundEndpointBehaviour() {
		Enumerator selection = (Enumerator) ((StructuredSelection) inboundEndpointBehaviour.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initInboundEndpointBehaviour(Object input, Enumerator current)
	 */
	public void initInboundEndpointBehaviour(Object input, Enumerator current) {
		inboundEndpointBehaviour.setInput(input);
		inboundEndpointBehaviour.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		if (eefElementEditorReadOnlyState && inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(false);
			inboundEndpointBehaviour.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundEndpointBehaviour(Enumerator newValue)
	 * 
	 */
	public void setInboundEndpointBehaviour(Enumerator newValue) {
		inboundEndpointBehaviour.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundEndpointBehaviour);
		if (eefElementEditorReadOnlyState && inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(false);
			inboundEndpointBehaviour.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundEndpointBehaviour.isEnabled()) {
			inboundEndpointBehaviour.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHttpPort()
	 * 
	 */
	public String getInboundHttpPort() {
		return inboundHttpPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHttpPort(String newValue)
	 * 
	 */
	public void setInboundHttpPort(String newValue) {
		if (newValue != null) {
			inboundHttpPort.setText(newValue);
		} else {
			inboundHttpPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHttpPort);
		if (eefElementEditorReadOnlyState && inboundHttpPort.isEnabled()) {
			inboundHttpPort.setEnabled(false);
			inboundHttpPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHttpPort.isEnabled()) {
			inboundHttpPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerPoolSizeCore()
	 * 
	 */
	public String getInboundWorkerPoolSizeCore() {
		return inboundWorkerPoolSizeCore.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerPoolSizeCore(String newValue)
	 * 
	 */
	public void setInboundWorkerPoolSizeCore(String newValue) {
		if (newValue != null) {
			inboundWorkerPoolSizeCore.setText(newValue);
		} else {
			inboundWorkerPoolSizeCore.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeCore);
		if (eefElementEditorReadOnlyState && inboundWorkerPoolSizeCore.isEnabled()) {
			inboundWorkerPoolSizeCore.setEnabled(false);
			inboundWorkerPoolSizeCore.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerPoolSizeCore.isEnabled()) {
			inboundWorkerPoolSizeCore.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerPoolSizeMax()
	 * 
	 */
	public String getInboundWorkerPoolSizeMax() {
		return inboundWorkerPoolSizeMax.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerPoolSizeMax(String newValue)
	 * 
	 */
	public void setInboundWorkerPoolSizeMax(String newValue) {
		if (newValue != null) {
			inboundWorkerPoolSizeMax.setText(newValue);
		} else {
			inboundWorkerPoolSizeMax.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolSizeMax);
		if (eefElementEditorReadOnlyState && inboundWorkerPoolSizeMax.isEnabled()) {
			inboundWorkerPoolSizeMax.setEnabled(false);
			inboundWorkerPoolSizeMax.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerPoolSizeMax.isEnabled()) {
			inboundWorkerPoolSizeMax.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerThreadKeepAliveSec()
	 * 
	 */
	public String getInboundWorkerThreadKeepAliveSec() {
		return inboundWorkerThreadKeepAliveSec.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerThreadKeepAliveSec(String newValue)
	 * 
	 */
	public void setInboundWorkerThreadKeepAliveSec(String newValue) {
		if (newValue != null) {
			inboundWorkerThreadKeepAliveSec.setText(newValue);
		} else {
			inboundWorkerThreadKeepAliveSec.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerThreadKeepAliveSec);
		if (eefElementEditorReadOnlyState && inboundWorkerThreadKeepAliveSec.isEnabled()) {
			inboundWorkerThreadKeepAliveSec.setEnabled(false);
			inboundWorkerThreadKeepAliveSec.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerThreadKeepAliveSec.isEnabled()) {
			inboundWorkerThreadKeepAliveSec.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundWorkerPoolQueueLength()
	 * 
	 */
	public String getInboundWorkerPoolQueueLength() {
		return inboundWorkerPoolQueueLength.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundWorkerPoolQueueLength(String newValue)
	 * 
	 */
	public void setInboundWorkerPoolQueueLength(String newValue) {
		if (newValue != null) {
			inboundWorkerPoolQueueLength.setText(newValue);
		} else {
			inboundWorkerPoolQueueLength.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundWorkerPoolQueueLength);
		if (eefElementEditorReadOnlyState && inboundWorkerPoolQueueLength.isEnabled()) {
			inboundWorkerPoolQueueLength.setEnabled(false);
			inboundWorkerPoolQueueLength.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundWorkerPoolQueueLength.isEnabled()) {
			inboundWorkerPoolQueueLength.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundThreadGroupId()
	 * 
	 */
	public String getInboundThreadGroupId() {
		return inboundThreadGroupId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundThreadGroupId(String newValue)
	 * 
	 */
	public void setInboundThreadGroupId(String newValue) {
		if (newValue != null) {
			inboundThreadGroupId.setText(newValue);
		} else {
			inboundThreadGroupId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadGroupId);
		if (eefElementEditorReadOnlyState && inboundThreadGroupId.isEnabled()) {
			inboundThreadGroupId.setEnabled(false);
			inboundThreadGroupId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundThreadGroupId.isEnabled()) {
			inboundThreadGroupId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundThreadId()
	 * 
	 */
	public String getInboundThreadId() {
		return inboundThreadId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundThreadId(String newValue)
	 * 
	 */
	public void setInboundThreadId(String newValue) {
		if (newValue != null) {
			inboundThreadId.setText(newValue);
		} else {
			inboundThreadId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundThreadId);
		if (eefElementEditorReadOnlyState && inboundThreadId.isEnabled()) {
			inboundThreadId.setEnabled(false);
			inboundThreadId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundThreadId.isEnabled()) {
			inboundThreadId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getDispatchFilterPattern()
	 * 
	 */
	public String getDispatchFilterPattern() {
		return dispatchFilterPattern.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setDispatchFilterPattern(String newValue)
	 * 
	 */
	public void setDispatchFilterPattern(String newValue) {
		if (newValue != null) {
			dispatchFilterPattern.setText(newValue);
		} else {
			dispatchFilterPattern.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.dispatchFilterPattern);
		if (eefElementEditorReadOnlyState && dispatchFilterPattern.isEnabled()) {
			dispatchFilterPattern.setEnabled(false);
			dispatchFilterPattern.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dispatchFilterPattern.isEnabled()) {
			dispatchFilterPattern.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInterval()
	 * 
	 */
	public String getInterval() {
		return interval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInterval(String newValue)
	 * 
	 */
	public void setInterval(String newValue) {
		if (newValue != null) {
			interval.setText(newValue);
		} else {
			interval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.interval);
		if (eefElementEditorReadOnlyState && interval.isEnabled()) {
			interval.setEnabled(false);
			interval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !interval.isEnabled()) {
			interval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSequential()
	 * 
	 */
	public Boolean getSequential() {
		return Boolean.valueOf(sequential.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSequential(Boolean newValue)
	 * 
	 */
	public void setSequential(Boolean newValue) {
		if (newValue != null) {
			sequential.setSelection(newValue.booleanValue());
		} else {
			sequential.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.sequential);
		if (eefElementEditorReadOnlyState && sequential.isEnabled()) {
			sequential.setEnabled(false);
			sequential.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sequential.isEnabled()) {
			sequential.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getCoordination()
	 * 
	 */
	public Boolean getCoordination() {
		return Boolean.valueOf(coordination.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setCoordination(Boolean newValue)
	 * 
	 */
	public void setCoordination(Boolean newValue) {
		if (newValue != null) {
			coordination.setSelection(newValue.booleanValue());
		} else {
			coordination.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.coordination);
		if (eefElementEditorReadOnlyState && coordination.isEnabled()) {
			coordination.setEnabled(false);
			coordination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !coordination.isEnabled()) {
			coordination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileURI()
	 * 
	 */
	public String getTransportVFSFileURI() {
		return transportVFSFileURI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileURI(String newValue)
	 * 
	 */
	public void setTransportVFSFileURI(String newValue) {
		if (newValue != null) {
			transportVFSFileURI.setText(newValue);
		} else {
			transportVFSFileURI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileURI);
		if (eefElementEditorReadOnlyState && transportVFSFileURI.isEnabled()) {
			transportVFSFileURI.setEnabled(false);
			transportVFSFileURI.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileURI.isEnabled()) {
			transportVFSFileURI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWso2mbConnectionUrl()
	 * 
	 */
	public String getWso2mbConnectionUrl() {
		return wso2mbConnectionUrl.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWso2mbConnectionUrl(String newValue)
	 * 
	 */
	public void setWso2mbConnectionUrl(String newValue) {
		if (newValue != null) {
			wso2mbConnectionUrl.setText(newValue);
		} else {
			wso2mbConnectionUrl.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wso2mbConnectionUrl);
		if (eefElementEditorReadOnlyState && wso2mbConnectionUrl.isEnabled()) {
			wso2mbConnectionUrl.setEnabled(false);
			wso2mbConnectionUrl.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wso2mbConnectionUrl.isEnabled()) {
			wso2mbConnectionUrl.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSContentType()
	 * 
	 */
	public String getTransportVFSContentType() {
		return transportVFSContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSContentType(String newValue)
	 * 
	 */
	public void setTransportVFSContentType(String newValue) {
		if (newValue != null) {
			transportVFSContentType.setText(newValue);
		} else {
			transportVFSContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSContentType);
		if (eefElementEditorReadOnlyState && transportVFSContentType.isEnabled()) {
			transportVFSContentType.setEnabled(false);
			transportVFSContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSContentType.isEnabled()) {
			transportVFSContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileNamePattern()
	 * 
	 */
	public String getTransportVFSFileNamePattern() {
		return transportVFSFileNamePattern.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileNamePattern(String newValue)
	 * 
	 */
	public void setTransportVFSFileNamePattern(String newValue) {
		if (newValue != null) {
			transportVFSFileNamePattern.setText(newValue);
		} else {
			transportVFSFileNamePattern.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileNamePattern);
		if (eefElementEditorReadOnlyState && transportVFSFileNamePattern.isEnabled()) {
			transportVFSFileNamePattern.setEnabled(false);
			transportVFSFileNamePattern.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileNamePattern.isEnabled()) {
			transportVFSFileNamePattern.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileProcessInterval()
	 * 
	 */
	public String getTransportVFSFileProcessInterval() {
		return transportVFSFileProcessInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileProcessInterval(String newValue)
	 * 
	 */
	public void setTransportVFSFileProcessInterval(String newValue) {
		if (newValue != null) {
			transportVFSFileProcessInterval.setText(newValue);
		} else {
			transportVFSFileProcessInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessInterval);
		if (eefElementEditorReadOnlyState && transportVFSFileProcessInterval.isEnabled()) {
			transportVFSFileProcessInterval.setEnabled(false);
			transportVFSFileProcessInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileProcessInterval.isEnabled()) {
			transportVFSFileProcessInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileProcessCount()
	 * 
	 */
	public String getTransportVFSFileProcessCount() {
		return transportVFSFileProcessCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileProcessCount(String newValue)
	 * 
	 */
	public void setTransportVFSFileProcessCount(String newValue) {
		if (newValue != null) {
			transportVFSFileProcessCount.setText(newValue);
		} else {
			transportVFSFileProcessCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileProcessCount);
		if (eefElementEditorReadOnlyState && transportVFSFileProcessCount.isEnabled()) {
			transportVFSFileProcessCount.setEnabled(false);
			transportVFSFileProcessCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileProcessCount.isEnabled()) {
			transportVFSFileProcessCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSLocking()
	 * 
	 */
	public Enumerator getTransportVFSLocking() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSLocking.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSLocking(Object input, Enumerator current)
	 */
	public void initTransportVFSLocking(Object input, Enumerator current) {
		transportVFSLocking.setInput(input);
		transportVFSLocking.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		if (eefElementEditorReadOnlyState && transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(false);
			transportVFSLocking.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSLocking(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSLocking(Enumerator newValue) {
		transportVFSLocking.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLocking);
		if (eefElementEditorReadOnlyState && transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(false);
			transportVFSLocking.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSLocking.isEnabled()) {
			transportVFSLocking.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMaxRetryCount()
	 * 
	 */
	public String getTransportVFSMaxRetryCount() {
		return transportVFSMaxRetryCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMaxRetryCount(String newValue)
	 * 
	 */
	public void setTransportVFSMaxRetryCount(String newValue) {
		if (newValue != null) {
			transportVFSMaxRetryCount.setText(newValue);
		} else {
			transportVFSMaxRetryCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMaxRetryCount);
		if (eefElementEditorReadOnlyState && transportVFSMaxRetryCount.isEnabled()) {
			transportVFSMaxRetryCount.setEnabled(false);
			transportVFSMaxRetryCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMaxRetryCount.isEnabled()) {
			transportVFSMaxRetryCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterFailedMove()
	 * 
	 */
	public String getTransportVFSMoveAfterFailedMove() {
		return transportVFSMoveAfterFailedMove.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterFailedMove(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterFailedMove(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterFailedMove.setText(newValue);
		} else {
			transportVFSMoveAfterFailedMove.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailedMove);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterFailedMove.isEnabled()) {
			transportVFSMoveAfterFailedMove.setEnabled(false);
			transportVFSMoveAfterFailedMove.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterFailedMove.isEnabled()) {
			transportVFSMoveAfterFailedMove.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSReconnectTimeout()
	 * 
	 */
	public String getTransportVFSReconnectTimeout() {
		return transportVFSReconnectTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSReconnectTimeout(String newValue)
	 * 
	 */
	public void setTransportVFSReconnectTimeout(String newValue) {
		if (newValue != null) {
			transportVFSReconnectTimeout.setText(newValue);
		} else {
			transportVFSReconnectTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReconnectTimeout);
		if (eefElementEditorReadOnlyState && transportVFSReconnectTimeout.isEnabled()) {
			transportVFSReconnectTimeout.setEnabled(false);
			transportVFSReconnectTimeout.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSReconnectTimeout.isEnabled()) {
			transportVFSReconnectTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSharedSubscription()
	 * 
	 */
	public Boolean getTransportJMSSharedSubscription() {
		return Boolean.valueOf(transportJMSSharedSubscription.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSharedSubscription(Boolean newValue)
	 * 
	 */
	public void setTransportJMSSharedSubscription(Boolean newValue) {
		if (newValue != null) {
			transportJMSSharedSubscription.setSelection(newValue.booleanValue());
		} else {
			transportJMSSharedSubscription.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSharedSubscription);
		if (eefElementEditorReadOnlyState && transportJMSSharedSubscription.isEnabled()) {
			transportJMSSharedSubscription.setEnabled(false);
			transportJMSSharedSubscription.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSharedSubscription.isEnabled()) {
			transportJMSSharedSubscription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSubscriptionName()
	 * 
	 */
	public String getTransportJMSSubscriptionName() {
		return transportJMSSubscriptionName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSubscriptionName(String newValue)
	 * 
	 */
	public void setTransportJMSSubscriptionName(String newValue) {
		if (newValue != null) {
			transportJMSSubscriptionName.setText(newValue);
		} else {
			transportJMSSubscriptionName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionName);
		if (eefElementEditorReadOnlyState && transportJMSSubscriptionName.isEnabled()) {
			transportJMSSubscriptionName.setEnabled(false);
			transportJMSSubscriptionName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSubscriptionName.isEnabled()) {
			transportJMSSubscriptionName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPinnedServers()
	 * 
	 */
	public String getTransportJMSPinnedServers() {
		return transportJMSPinnedServers.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPinnedServers(String newValue)
	 * 
	 */
	public void setTransportJMSPinnedServers(String newValue) {
		if (newValue != null) {
			transportJMSPinnedServers.setText(newValue);
		} else {
			transportJMSPinnedServers.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPinnedServers);
		if (eefElementEditorReadOnlyState && transportJMSPinnedServers.isEnabled()) {
			transportJMSPinnedServers.setEnabled(false);
			transportJMSPinnedServers.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPinnedServers.isEnabled()) {
			transportJMSPinnedServers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSActionAfterProcess()
	 * 
	 */
	public Enumerator getTransportVFSActionAfterProcess() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSActionAfterProcess.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSActionAfterProcess(Object input, Enumerator current)
	 */
	public void initTransportVFSActionAfterProcess(Object input, Enumerator current) {
		transportVFSActionAfterProcess.setInput(input);
		transportVFSActionAfterProcess.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(false);
			transportVFSActionAfterProcess.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSActionAfterProcess(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSActionAfterProcess(Enumerator newValue) {
		transportVFSActionAfterProcess.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterProcess);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(false);
			transportVFSActionAfterProcess.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterProcess.isEnabled()) {
			transportVFSActionAfterProcess.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterProcess()
	 * 
	 */
	public String getTransportVFSMoveAfterProcess() {
		return transportVFSMoveAfterProcess.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterProcess(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterProcess(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterProcess.setText(newValue);
		} else {
			transportVFSMoveAfterProcess.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterProcess);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterProcess.isEnabled()) {
			transportVFSMoveAfterProcess.setEnabled(false);
			transportVFSMoveAfterProcess.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterProcess.isEnabled()) {
			transportVFSMoveAfterProcess.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSActionAfterErrors()
	 * 
	 */
	public Enumerator getTransportVFSActionAfterErrors() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSActionAfterErrors.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSActionAfterErrors(Object input, Enumerator current)
	 */
	public void initTransportVFSActionAfterErrors(Object input, Enumerator current) {
		transportVFSActionAfterErrors.setInput(input);
		transportVFSActionAfterErrors.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(false);
			transportVFSActionAfterErrors.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSActionAfterErrors(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSActionAfterErrors(Enumerator newValue) {
		transportVFSActionAfterErrors.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterErrors);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(false);
			transportVFSActionAfterErrors.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterErrors.isEnabled()) {
			transportVFSActionAfterErrors.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterErrors()
	 * 
	 */
	public String getTransportVFSMoveAfterErrors() {
		return transportVFSMoveAfterErrors.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterErrors(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterErrors(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterErrors.setText(newValue);
		} else {
			transportVFSMoveAfterErrors.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterErrors);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterErrors.isEnabled()) {
			transportVFSMoveAfterErrors.setEnabled(false);
			transportVFSMoveAfterErrors.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterErrors.isEnabled()) {
			transportVFSMoveAfterErrors.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFailedRecordsFileName()
	 * 
	 */
	public String getTransportVFSFailedRecordsFileName() {
		return transportVFSFailedRecordsFileName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFailedRecordsFileName(String newValue)
	 * 
	 */
	public void setTransportVFSFailedRecordsFileName(String newValue) {
		if (newValue != null) {
			transportVFSFailedRecordsFileName.setText(newValue);
		} else {
			transportVFSFailedRecordsFileName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileName);
		if (eefElementEditorReadOnlyState && transportVFSFailedRecordsFileName.isEnabled()) {
			transportVFSFailedRecordsFileName.setEnabled(false);
			transportVFSFailedRecordsFileName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFailedRecordsFileName.isEnabled()) {
			transportVFSFailedRecordsFileName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFailedRecordsFileDestination()
	 * 
	 */
	public String getTransportVFSFailedRecordsFileDestination() {
		return transportVFSFailedRecordsFileDestination.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFailedRecordsFileDestination(String newValue)
	 * 
	 */
	public void setTransportVFSFailedRecordsFileDestination(String newValue) {
		if (newValue != null) {
			transportVFSFailedRecordsFileDestination.setText(newValue);
		} else {
			transportVFSFailedRecordsFileDestination.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordsFileDestination);
		if (eefElementEditorReadOnlyState && transportVFSFailedRecordsFileDestination.isEnabled()) {
			transportVFSFailedRecordsFileDestination.setEnabled(false);
			transportVFSFailedRecordsFileDestination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFailedRecordsFileDestination.isEnabled()) {
			transportVFSFailedRecordsFileDestination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveFailedRecordTimestampFormat()
	 * 
	 */
	public String getTransportVFSMoveFailedRecordTimestampFormat() {
		return transportVFSMoveFailedRecordTimestampFormat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveFailedRecordTimestampFormat(String newValue)
	 * 
	 */
	public void setTransportVFSMoveFailedRecordTimestampFormat(String newValue) {
		if (newValue != null) {
			transportVFSMoveFailedRecordTimestampFormat.setText(newValue);
		} else {
			transportVFSMoveFailedRecordTimestampFormat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveFailedRecordTimestampFormat);
		if (eefElementEditorReadOnlyState && transportVFSMoveFailedRecordTimestampFormat.isEnabled()) {
			transportVFSMoveFailedRecordTimestampFormat.setEnabled(false);
			transportVFSMoveFailedRecordTimestampFormat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveFailedRecordTimestampFormat.isEnabled()) {
			transportVFSMoveFailedRecordTimestampFormat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFailedRecordNextRetryDuration()
	 * 
	 */
	public String getTransportVFSFailedRecordNextRetryDuration() {
		return transportVFSFailedRecordNextRetryDuration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFailedRecordNextRetryDuration(String newValue)
	 * 
	 */
	public void setTransportVFSFailedRecordNextRetryDuration(String newValue) {
		if (newValue != null) {
			transportVFSFailedRecordNextRetryDuration.setText(newValue);
		} else {
			transportVFSFailedRecordNextRetryDuration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFailedRecordNextRetryDuration);
		if (eefElementEditorReadOnlyState && transportVFSFailedRecordNextRetryDuration.isEnabled()) {
			transportVFSFailedRecordNextRetryDuration.setEnabled(false);
			transportVFSFailedRecordNextRetryDuration.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFailedRecordNextRetryDuration.isEnabled()) {
			transportVFSFailedRecordNextRetryDuration.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSActionAfterFailure()
	 * 
	 */
	public Enumerator getTransportVFSActionAfterFailure() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSActionAfterFailure.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSActionAfterFailure(Object input, Enumerator current)
	 */
	public void initTransportVFSActionAfterFailure(Object input, Enumerator current) {
		transportVFSActionAfterFailure.setInput(input);
		transportVFSActionAfterFailure.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(false);
			transportVFSActionAfterFailure.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSActionAfterFailure(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSActionAfterFailure(Enumerator newValue) {
		transportVFSActionAfterFailure.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSActionAfterFailure);
		if (eefElementEditorReadOnlyState && transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(false);
			transportVFSActionAfterFailure.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSActionAfterFailure.isEnabled()) {
			transportVFSActionAfterFailure.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveAfterFailure()
	 * 
	 */
	public String getTransportVFSMoveAfterFailure() {
		return transportVFSMoveAfterFailure.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveAfterFailure(String newValue)
	 * 
	 */
	public void setTransportVFSMoveAfterFailure(String newValue) {
		if (newValue != null) {
			transportVFSMoveAfterFailure.setText(newValue);
		} else {
			transportVFSMoveAfterFailure.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveAfterFailure);
		if (eefElementEditorReadOnlyState && transportVFSMoveAfterFailure.isEnabled()) {
			transportVFSMoveAfterFailure.setEnabled(false);
			transportVFSMoveAfterFailure.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveAfterFailure.isEnabled()) {
			transportVFSMoveAfterFailure.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSReplyFileURI()
	 * 
	 */
	public String getTransportVFSReplyFileURI() {
		return transportVFSReplyFileURI.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSReplyFileURI(String newValue)
	 * 
	 */
	public void setTransportVFSReplyFileURI(String newValue) {
		if (newValue != null) {
			transportVFSReplyFileURI.setText(newValue);
		} else {
			transportVFSReplyFileURI.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileURI);
		if (eefElementEditorReadOnlyState && transportVFSReplyFileURI.isEnabled()) {
			transportVFSReplyFileURI.setEnabled(false);
			transportVFSReplyFileURI.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSReplyFileURI.isEnabled()) {
			transportVFSReplyFileURI.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSReplyFileName()
	 * 
	 */
	public String getTransportVFSReplyFileName() {
		return transportVFSReplyFileName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSReplyFileName(String newValue)
	 * 
	 */
	public void setTransportVFSReplyFileName(String newValue) {
		if (newValue != null) {
			transportVFSReplyFileName.setText(newValue);
		} else {
			transportVFSReplyFileName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSReplyFileName);
		if (eefElementEditorReadOnlyState && transportVFSReplyFileName.isEnabled()) {
			transportVFSReplyFileName.setEnabled(false);
			transportVFSReplyFileName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSReplyFileName.isEnabled()) {
			transportVFSReplyFileName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSAutoLockRelease()
	 * 
	 */
	public Boolean getTransportVFSAutoLockRelease() {
		return Boolean.valueOf(transportVFSAutoLockRelease.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSAutoLockRelease(Boolean newValue)
	 * 
	 */
	public void setTransportVFSAutoLockRelease(Boolean newValue) {
		if (newValue != null) {
			transportVFSAutoLockRelease.setSelection(newValue.booleanValue());
		} else {
			transportVFSAutoLockRelease.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockRelease);
		if (eefElementEditorReadOnlyState && transportVFSAutoLockRelease.isEnabled()) {
			transportVFSAutoLockRelease.setEnabled(false);
			transportVFSAutoLockRelease.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSAutoLockRelease.isEnabled()) {
			transportVFSAutoLockRelease.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSAutoLockReleaseInterval()
	 * 
	 */
	public String getTransportVFSAutoLockReleaseInterval() {
		return transportVFSAutoLockReleaseInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSAutoLockReleaseInterval(String newValue)
	 * 
	 */
	public void setTransportVFSAutoLockReleaseInterval(String newValue) {
		if (newValue != null) {
			transportVFSAutoLockReleaseInterval.setText(newValue);
		} else {
			transportVFSAutoLockReleaseInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSAutoLockReleaseInterval);
		if (eefElementEditorReadOnlyState && transportVFSAutoLockReleaseInterval.isEnabled()) {
			transportVFSAutoLockReleaseInterval.setEnabled(false);
			transportVFSAutoLockReleaseInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSAutoLockReleaseInterval.isEnabled()) {
			transportVFSAutoLockReleaseInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSLockReleaseSameNode()
	 * 
	 */
	public Boolean getTransportVFSLockReleaseSameNode() {
		return Boolean.valueOf(transportVFSLockReleaseSameNode.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSLockReleaseSameNode(Boolean newValue)
	 * 
	 */
	public void setTransportVFSLockReleaseSameNode(Boolean newValue) {
		if (newValue != null) {
			transportVFSLockReleaseSameNode.setSelection(newValue.booleanValue());
		} else {
			transportVFSLockReleaseSameNode.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSLockReleaseSameNode);
		if (eefElementEditorReadOnlyState && transportVFSLockReleaseSameNode.isEnabled()) {
			transportVFSLockReleaseSameNode.setEnabled(false);
			transportVFSLockReleaseSameNode.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSLockReleaseSameNode.isEnabled()) {
			transportVFSLockReleaseSameNode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSDistributedLock()
	 * 
	 */
	public Boolean getTransportVFSDistributedLock() {
		return Boolean.valueOf(transportVFSDistributedLock.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSDistributedLock(Boolean newValue)
	 * 
	 */
	public void setTransportVFSDistributedLock(Boolean newValue) {
		if (newValue != null) {
			transportVFSDistributedLock.setSelection(newValue.booleanValue());
		} else {
			transportVFSDistributedLock.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedLock);
		if (eefElementEditorReadOnlyState && transportVFSDistributedLock.isEnabled()) {
			transportVFSDistributedLock.setEnabled(false);
			transportVFSDistributedLock.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSDistributedLock.isEnabled()) {
			transportVFSDistributedLock.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSStreaming()
	 * 
	 */
	public Boolean getTransportVFSStreaming() {
		return Boolean.valueOf(transportVFSStreaming.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSStreaming(Boolean newValue)
	 * 
	 */
	public void setTransportVFSStreaming(Boolean newValue) {
		if (newValue != null) {
			transportVFSStreaming.setSelection(newValue.booleanValue());
		} else {
			transportVFSStreaming.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSStreaming);
		if (eefElementEditorReadOnlyState && transportVFSStreaming.isEnabled()) {
			transportVFSStreaming.setEnabled(false);
			transportVFSStreaming.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSStreaming.isEnabled()) {
			transportVFSStreaming.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSBuild()
	 * 
	 */
	public Boolean getTransportVFSBuild() {
		return Boolean.valueOf(transportVFSBuild.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSBuild(Boolean newValue)
	 * 
	 */
	public void setTransportVFSBuild(Boolean newValue) {
		if (newValue != null) {
			transportVFSBuild.setSelection(newValue.booleanValue());
		} else {
			transportVFSBuild.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSBuild);
		if (eefElementEditorReadOnlyState && transportVFSBuild.isEnabled()) {
			transportVFSBuild.setEnabled(false);
			transportVFSBuild.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSBuild.isEnabled()) {
			transportVFSBuild.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSDistributedTimeout()
	 * 
	 */
	public String getTransportVFSDistributedTimeout() {
		return transportVFSDistributedTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSDistributedTimeout(String newValue)
	 * 
	 */
	public void setTransportVFSDistributedTimeout(String newValue) {
		if (newValue != null) {
			transportVFSDistributedTimeout.setText(newValue);
		} else {
			transportVFSDistributedTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSDistributedTimeout);
		if (eefElementEditorReadOnlyState && transportVFSDistributedTimeout.isEnabled()) {
			transportVFSDistributedTimeout.setEnabled(false);
			transportVFSDistributedTimeout.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSDistributedTimeout.isEnabled()) {
			transportVFSDistributedTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getJavaNamingFactoryInitial()
	 * 
	 */
	public String getJavaNamingFactoryInitial() {
		return javaNamingFactoryInitial.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setJavaNamingFactoryInitial(String newValue)
	 * 
	 */
	public void setJavaNamingFactoryInitial(String newValue) {
		if (newValue != null) {
			javaNamingFactoryInitial.setText(newValue);
		} else {
			javaNamingFactoryInitial.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.javaNamingFactoryInitial);
		if (eefElementEditorReadOnlyState && javaNamingFactoryInitial.isEnabled()) {
			javaNamingFactoryInitial.setEnabled(false);
			javaNamingFactoryInitial.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !javaNamingFactoryInitial.isEnabled()) {
			javaNamingFactoryInitial.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getJavaNamingProviderUrl()
	 * 
	 */
	public String getJavaNamingProviderUrl() {
		return javaNamingProviderUrl.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setJavaNamingProviderUrl(String newValue)
	 * 
	 */
	public void setJavaNamingProviderUrl(String newValue) {
		if (newValue != null) {
			javaNamingProviderUrl.setText(newValue);
		} else {
			javaNamingProviderUrl.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.javaNamingProviderUrl);
		if (eefElementEditorReadOnlyState && javaNamingProviderUrl.isEnabled()) {
			javaNamingProviderUrl.setEnabled(false);
			javaNamingProviderUrl.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !javaNamingProviderUrl.isEnabled()) {
			javaNamingProviderUrl.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSConnectionFactoryJNDIName()
	 * 
	 */
	public String getTransportJMSConnectionFactoryJNDIName() {
		return transportJMSConnectionFactoryJNDIName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSConnectionFactoryJNDIName(String newValue)
	 * 
	 */
	public void setTransportJMSConnectionFactoryJNDIName(String newValue) {
		if (newValue != null) {
			transportJMSConnectionFactoryJNDIName.setText(newValue);
		} else {
			transportJMSConnectionFactoryJNDIName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryJNDIName);
		if (eefElementEditorReadOnlyState && transportJMSConnectionFactoryJNDIName.isEnabled()) {
			transportJMSConnectionFactoryJNDIName.setEnabled(false);
			transportJMSConnectionFactoryJNDIName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConnectionFactoryJNDIName.isEnabled()) {
			transportJMSConnectionFactoryJNDIName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSConnectionFactoryType()
	 * 
	 */
	public Enumerator getTransportJMSConnectionFactoryType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSConnectionFactoryType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSConnectionFactoryType(Object input, Enumerator current)
	 */
	public void initTransportJMSConnectionFactoryType(Object input, Enumerator current) {
		transportJMSConnectionFactoryType.setInput(input);
		transportJMSConnectionFactoryType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		if (eefElementEditorReadOnlyState && transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(false);
			transportJMSConnectionFactoryType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSConnectionFactoryType(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSConnectionFactoryType(Enumerator newValue) {
		transportJMSConnectionFactoryType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConnectionFactoryType);
		if (eefElementEditorReadOnlyState && transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(false);
			transportJMSConnectionFactoryType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConnectionFactoryType.isEnabled()) {
			transportJMSConnectionFactoryType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSConcurrentConsumers()
	 * 
	 */
	public String getTransportJMSConcurrentConsumers() {
		return transportJMSConcurrentConsumers.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSConcurrentConsumers(String newValue)
	 * 
	 */
	public void setTransportJMSConcurrentConsumers(String newValue) {
		if (newValue != null) {
			transportJMSConcurrentConsumers.setText(newValue);
		} else {
			transportJMSConcurrentConsumers.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSConcurrentConsumers);
		if (eefElementEditorReadOnlyState && transportJMSConcurrentConsumers.isEnabled()) {
			transportJMSConcurrentConsumers.setEnabled(false);
			transportJMSConcurrentConsumers.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSConcurrentConsumers.isEnabled()) {
			transportJMSConcurrentConsumers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDestination()
	 * 
	 */
	public String getTransportJMSDestination() {
		return transportJMSDestination.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDestination(String newValue)
	 * 
	 */
	public void setTransportJMSDestination(String newValue) {
		if (newValue != null) {
			transportJMSDestination.setText(newValue);
		} else {
			transportJMSDestination.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDestination);
		if (eefElementEditorReadOnlyState && transportJMSDestination.isEnabled()) {
			transportJMSDestination.setEnabled(false);
			transportJMSDestination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDestination.isEnabled()) {
			transportJMSDestination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSessionTransacted()
	 * 
	 */
	public Boolean getTransportJMSSessionTransacted() {
		return Boolean.valueOf(transportJMSSessionTransacted.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSessionTransacted(Boolean newValue)
	 * 
	 */
	public void setTransportJMSSessionTransacted(Boolean newValue) {
		if (newValue != null) {
			transportJMSSessionTransacted.setSelection(newValue.booleanValue());
		} else {
			transportJMSSessionTransacted.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionTransacted);
		if (eefElementEditorReadOnlyState && transportJMSSessionTransacted.isEnabled()) {
			transportJMSSessionTransacted.setEnabled(false);
			transportJMSSessionTransacted.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSessionTransacted.isEnabled()) {
			transportJMSSessionTransacted.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSessionAcknowledgement()
	 * 
	 */
	public Enumerator getTransportJMSSessionAcknowledgement() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSSessionAcknowledgement.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSSessionAcknowledgement(Object input, Enumerator current)
	 */
	public void initTransportJMSSessionAcknowledgement(Object input, Enumerator current) {
		transportJMSSessionAcknowledgement.setInput(input);
		transportJMSSessionAcknowledgement.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		if (eefElementEditorReadOnlyState && transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(false);
			transportJMSSessionAcknowledgement.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSessionAcknowledgement(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSSessionAcknowledgement(Enumerator newValue) {
		transportJMSSessionAcknowledgement.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSessionAcknowledgement);
		if (eefElementEditorReadOnlyState && transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(false);
			transportJMSSessionAcknowledgement.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSessionAcknowledgement.isEnabled()) {
			transportJMSSessionAcknowledgement.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSCacheLevel()
	 * 
	 */
	public Enumerator getTransportJMSCacheLevel() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSCacheLevel.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSCacheLevel(Object input, Enumerator current)
	 */
	public void initTransportJMSCacheLevel(Object input, Enumerator current) {
		transportJMSCacheLevel.setInput(input);
		transportJMSCacheLevel.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		if (eefElementEditorReadOnlyState && transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(false);
			transportJMSCacheLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSCacheLevel(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSCacheLevel(Enumerator newValue) {
		transportJMSCacheLevel.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSCacheLevel);
		if (eefElementEditorReadOnlyState && transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(false);
			transportJMSCacheLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSCacheLevel.isEnabled()) {
			transportJMSCacheLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSUserName()
	 * 
	 */
	public String getTransportJMSUserName() {
		return transportJMSUserName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSUserName(String newValue)
	 * 
	 */
	public void setTransportJMSUserName(String newValue) {
		if (newValue != null) {
			transportJMSUserName.setText(newValue);
		} else {
			transportJMSUserName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSUserName);
		if (eefElementEditorReadOnlyState && transportJMSUserName.isEnabled()) {
			transportJMSUserName.setEnabled(false);
			transportJMSUserName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSUserName.isEnabled()) {
			transportJMSUserName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPassword()
	 * 
	 */
	public String getTransportJMSPassword() {
		return transportJMSPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPassword(String newValue)
	 * 
	 */
	public void setTransportJMSPassword(String newValue) {
		if (newValue != null) {
			transportJMSPassword.setText(newValue);
		} else {
			transportJMSPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPassword);
		if (eefElementEditorReadOnlyState && transportJMSPassword.isEnabled()) {
			transportJMSPassword.setEnabled(false);
			transportJMSPassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPassword.isEnabled()) {
			transportJMSPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSJMSSpecVersion()
	 * 
	 */
	public String getTransportJMSJMSSpecVersion() {
		return transportJMSJMSSpecVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSJMSSpecVersion(String newValue)
	 * 
	 */
	public void setTransportJMSJMSSpecVersion(String newValue) {
		if (newValue != null) {
			transportJMSJMSSpecVersion.setText(newValue);
		} else {
			transportJMSJMSSpecVersion.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSJMSSpecVersion);
		if (eefElementEditorReadOnlyState && transportJMSJMSSpecVersion.isEnabled()) {
			transportJMSJMSSpecVersion.setEnabled(false);
			transportJMSJMSSpecVersion.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSJMSSpecVersion.isEnabled()) {
			transportJMSJMSSpecVersion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSSubscriptionDurable()
	 * 
	 */
	public String getTransportJMSSubscriptionDurable() {
		return transportJMSSubscriptionDurable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSSubscriptionDurable(String newValue)
	 * 
	 */
	public void setTransportJMSSubscriptionDurable(String newValue) {
		if (newValue != null) {
			transportJMSSubscriptionDurable.setText(newValue);
		} else {
			transportJMSSubscriptionDurable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSSubscriptionDurable);
		if (eefElementEditorReadOnlyState && transportJMSSubscriptionDurable.isEnabled()) {
			transportJMSSubscriptionDurable.setEnabled(false);
			transportJMSSubscriptionDurable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSSubscriptionDurable.isEnabled()) {
			transportJMSSubscriptionDurable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDurableSubscriberClientID()
	 * 
	 */
	public String getTransportJMSDurableSubscriberClientID() {
		return transportJMSDurableSubscriberClientID.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDurableSubscriberClientID(String newValue)
	 * 
	 */
	public void setTransportJMSDurableSubscriberClientID(String newValue) {
		if (newValue != null) {
			transportJMSDurableSubscriberClientID.setText(newValue);
		} else {
			transportJMSDurableSubscriberClientID.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberClientID);
		if (eefElementEditorReadOnlyState && transportJMSDurableSubscriberClientID.isEnabled()) {
			transportJMSDurableSubscriberClientID.setEnabled(false);
			transportJMSDurableSubscriberClientID.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDurableSubscriberClientID.isEnabled()) {
			transportJMSDurableSubscriberClientID.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSMessageSelector()
	 * 
	 */
	public String getTransportJMSMessageSelector() {
		return transportJMSMessageSelector.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSMessageSelector(String newValue)
	 * 
	 */
	public void setTransportJMSMessageSelector(String newValue) {
		if (newValue != null) {
			transportJMSMessageSelector.setText(newValue);
		} else {
			transportJMSMessageSelector.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSMessageSelector);
		if (eefElementEditorReadOnlyState && transportJMSMessageSelector.isEnabled()) {
			transportJMSMessageSelector.setEnabled(false);
			transportJMSMessageSelector.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSMessageSelector.isEnabled()) {
			transportJMSMessageSelector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSRetryDuration()
	 * 
	 */
	public String getTransportJMSRetryDuration() {
		return transportJMSRetryDuration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSRetryDuration(String newValue)
	 * 
	 */
	public void setTransportJMSRetryDuration(String newValue) {
		if (newValue != null) {
			transportJMSRetryDuration.setText(newValue);
		} else {
			transportJMSRetryDuration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetryDuration);
		if (eefElementEditorReadOnlyState && transportJMSRetryDuration.isEnabled()) {
			transportJMSRetryDuration.setEnabled(false);
			transportJMSRetryDuration.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSRetryDuration.isEnabled()) {
			transportJMSRetryDuration.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSMoveTimestampFormat()
	 * 
	 */
	public String getTransportVFSMoveTimestampFormat() {
		return transportVFSMoveTimestampFormat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSMoveTimestampFormat(String newValue)
	 * 
	 */
	public void setTransportVFSMoveTimestampFormat(String newValue) {
		if (newValue != null) {
			transportVFSMoveTimestampFormat.setText(newValue);
		} else {
			transportVFSMoveTimestampFormat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSMoveTimestampFormat);
		if (eefElementEditorReadOnlyState && transportVFSMoveTimestampFormat.isEnabled()) {
			transportVFSMoveTimestampFormat.setEnabled(false);
			transportVFSMoveTimestampFormat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSMoveTimestampFormat.isEnabled()) {
			transportVFSMoveTimestampFormat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileSortAttribute()
	 * 
	 */
	public Enumerator getTransportVFSFileSortAttribute() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportVFSFileSortAttribute.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportVFSFileSortAttribute(Object input, Enumerator current)
	 */
	public void initTransportVFSFileSortAttribute(Object input, Enumerator current) {
		transportVFSFileSortAttribute.setInput(input);
		transportVFSFileSortAttribute.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		if (eefElementEditorReadOnlyState && transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(false);
			transportVFSFileSortAttribute.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileSortAttribute(Enumerator newValue)
	 * 
	 */
	public void setTransportVFSFileSortAttribute(Enumerator newValue) {
		transportVFSFileSortAttribute.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAttribute);
		if (eefElementEditorReadOnlyState && transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(false);
			transportVFSFileSortAttribute.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileSortAttribute.isEnabled()) {
			transportVFSFileSortAttribute.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSFileSortAscending()
	 * 
	 */
	public Boolean getTransportVFSFileSortAscending() {
		return Boolean.valueOf(transportVFSFileSortAscending.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSFileSortAscending(Boolean newValue)
	 * 
	 */
	public void setTransportVFSFileSortAscending(Boolean newValue) {
		if (newValue != null) {
			transportVFSFileSortAscending.setSelection(newValue.booleanValue());
		} else {
			transportVFSFileSortAscending.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSFileSortAscending);
		if (eefElementEditorReadOnlyState && transportVFSFileSortAscending.isEnabled()) {
			transportVFSFileSortAscending.setEnabled(false);
			transportVFSFileSortAscending.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSFileSortAscending.isEnabled()) {
			transportVFSFileSortAscending.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSSubFolderTimestampFormat()
	 * 
	 */
	public String getTransportVFSSubFolderTimestampFormat() {
		return transportVFSSubFolderTimestampFormat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSSubFolderTimestampFormat(String newValue)
	 * 
	 */
	public void setTransportVFSSubFolderTimestampFormat(String newValue) {
		if (newValue != null) {
			transportVFSSubFolderTimestampFormat.setText(newValue);
		} else {
			transportVFSSubFolderTimestampFormat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSSubFolderTimestampFormat);
		if (eefElementEditorReadOnlyState && transportVFSSubFolderTimestampFormat.isEnabled()) {
			transportVFSSubFolderTimestampFormat.setEnabled(false);
			transportVFSSubFolderTimestampFormat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSSubFolderTimestampFormat.isEnabled()) {
			transportVFSSubFolderTimestampFormat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportVFSCreateFolder()
	 * 
	 */
	public Boolean getTransportVFSCreateFolder() {
		return Boolean.valueOf(transportVFSCreateFolder.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportVFSCreateFolder(Boolean newValue)
	 * 
	 */
	public void setTransportVFSCreateFolder(Boolean newValue) {
		if (newValue != null) {
			transportVFSCreateFolder.setSelection(newValue.booleanValue());
		} else {
			transportVFSCreateFolder.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportVFSCreateFolder);
		if (eefElementEditorReadOnlyState && transportVFSCreateFolder.isEnabled()) {
			transportVFSCreateFolder.setEnabled(false);
			transportVFSCreateFolder.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportVFSCreateFolder.isEnabled()) {
			transportVFSCreateFolder.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSReceiveTimeout()
	 * 
	 */
	public String getTransportJMSReceiveTimeout() {
		return transportJMSReceiveTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSReceiveTimeout(String newValue)
	 * 
	 */
	public void setTransportJMSReceiveTimeout(String newValue) {
		if (newValue != null) {
			transportJMSReceiveTimeout.setText(newValue);
		} else {
			transportJMSReceiveTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReceiveTimeout);
		if (eefElementEditorReadOnlyState && transportJMSReceiveTimeout.isEnabled()) {
			transportJMSReceiveTimeout.setEnabled(false);
			transportJMSReceiveTimeout.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSReceiveTimeout.isEnabled()) {
			transportJMSReceiveTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSContentType()
	 * 
	 */
	public String getTransportJMSContentType() {
		return transportJMSContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSContentType(String newValue)
	 * 
	 */
	public void setTransportJMSContentType(String newValue) {
		if (newValue != null) {
			transportJMSContentType.setText(newValue);
		} else {
			transportJMSContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentType);
		if (eefElementEditorReadOnlyState && transportJMSContentType.isEnabled()) {
			transportJMSContentType.setEnabled(false);
			transportJMSContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSContentType.isEnabled()) {
			transportJMSContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSContentTypeProperty()
	 * 
	 */
	public String getTransportJMSContentTypeProperty() {
		return transportJMSContentTypeProperty.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSContentTypeProperty(String newValue)
	 * 
	 */
	public void setTransportJMSContentTypeProperty(String newValue) {
		if (newValue != null) {
			transportJMSContentTypeProperty.setText(newValue);
		} else {
			transportJMSContentTypeProperty.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSContentTypeProperty);
		if (eefElementEditorReadOnlyState && transportJMSContentTypeProperty.isEnabled()) {
			transportJMSContentTypeProperty.setEnabled(false);
			transportJMSContentTypeProperty.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSContentTypeProperty.isEnabled()) {
			transportJMSContentTypeProperty.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSReplyDestination()
	 * 
	 */
	public String getTransportJMSReplyDestination() {
		return transportJMSReplyDestination.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSReplyDestination(String newValue)
	 * 
	 */
	public void setTransportJMSReplyDestination(String newValue) {
		if (newValue != null) {
			transportJMSReplyDestination.setText(newValue);
		} else {
			transportJMSReplyDestination.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSReplyDestination);
		if (eefElementEditorReadOnlyState && transportJMSReplyDestination.isEnabled()) {
			transportJMSReplyDestination.setEnabled(false);
			transportJMSReplyDestination.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSReplyDestination.isEnabled()) {
			transportJMSReplyDestination.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPubSubNoLocal()
	 * 
	 */
	public String getTransportJMSPubSubNoLocal() {
		return transportJMSPubSubNoLocal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPubSubNoLocal(String newValue)
	 * 
	 */
	public void setTransportJMSPubSubNoLocal(String newValue) {
		if (newValue != null) {
			transportJMSPubSubNoLocal.setText(newValue);
		} else {
			transportJMSPubSubNoLocal.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPubSubNoLocal);
		if (eefElementEditorReadOnlyState && transportJMSPubSubNoLocal.isEnabled()) {
			transportJMSPubSubNoLocal.setEnabled(false);
			transportJMSPubSubNoLocal.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPubSubNoLocal.isEnabled()) {
			transportJMSPubSubNoLocal.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDurableSubscriberName()
	 * 
	 */
	public String getTransportJMSDurableSubscriberName() {
		return transportJMSDurableSubscriberName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDurableSubscriberName(String newValue)
	 * 
	 */
	public void setTransportJMSDurableSubscriberName(String newValue) {
		if (newValue != null) {
			transportJMSDurableSubscriberName.setText(newValue);
		} else {
			transportJMSDurableSubscriberName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDurableSubscriberName);
		if (eefElementEditorReadOnlyState && transportJMSDurableSubscriberName.isEnabled()) {
			transportJMSDurableSubscriberName.setEnabled(false);
			transportJMSDurableSubscriberName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDurableSubscriberName.isEnabled()) {
			transportJMSDurableSubscriberName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSBrokerType()
	 * 
	 */
	public Enumerator getTransportJMSBrokerType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportJMSBrokerType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportJMSBrokerType(Object input, Enumerator current)
	 */
	public void initTransportJMSBrokerType(Object input, Enumerator current) {
		transportJMSBrokerType.setInput(input);
		transportJMSBrokerType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		if (eefElementEditorReadOnlyState && transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(false);
			transportJMSBrokerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSBrokerType(Enumerator newValue)
	 * 
	 */
	public void setTransportJMSBrokerType(Enumerator newValue) {
		transportJMSBrokerType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSBrokerType);
		if (eefElementEditorReadOnlyState && transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(false);
			transportJMSBrokerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSBrokerType.isEnabled()) {
			transportJMSBrokerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTConnectionFactory()
	 * 
	 */
	public String getTransportMQTTConnectionFactory() {
		return transportMQTTConnectionFactory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTConnectionFactory(String newValue)
	 * 
	 */
	public void setTransportMQTTConnectionFactory(String newValue) {
		if (newValue != null) {
			transportMQTTConnectionFactory.setText(newValue);
		} else {
			transportMQTTConnectionFactory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTConnectionFactory);
		if (eefElementEditorReadOnlyState && transportMQTTConnectionFactory.isEnabled()) {
			transportMQTTConnectionFactory.setEnabled(false);
			transportMQTTConnectionFactory.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTConnectionFactory.isEnabled()) {
			transportMQTTConnectionFactory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTServerHostName()
	 * 
	 */
	public String getTransportMQTTServerHostName() {
		return transportMQTTServerHostName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTServerHostName(String newValue)
	 * 
	 */
	public void setTransportMQTTServerHostName(String newValue) {
		if (newValue != null) {
			transportMQTTServerHostName.setText(newValue);
		} else {
			transportMQTTServerHostName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerHostName);
		if (eefElementEditorReadOnlyState && transportMQTTServerHostName.isEnabled()) {
			transportMQTTServerHostName.setEnabled(false);
			transportMQTTServerHostName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTServerHostName.isEnabled()) {
			transportMQTTServerHostName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTServerPort()
	 * 
	 */
	public String getTransportMQTTServerPort() {
		return transportMQTTServerPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTServerPort(String newValue)
	 * 
	 */
	public void setTransportMQTTServerPort(String newValue) {
		if (newValue != null) {
			transportMQTTServerPort.setText(newValue);
		} else {
			transportMQTTServerPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTServerPort);
		if (eefElementEditorReadOnlyState && transportMQTTServerPort.isEnabled()) {
			transportMQTTServerPort.setEnabled(false);
			transportMQTTServerPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTServerPort.isEnabled()) {
			transportMQTTServerPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTTopicName()
	 * 
	 */
	public String getTransportMQTTTopicName() {
		return transportMQTTTopicName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTTopicName(String newValue)
	 * 
	 */
	public void setTransportMQTTTopicName(String newValue) {
		if (newValue != null) {
			transportMQTTTopicName.setText(newValue);
		} else {
			transportMQTTTopicName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTopicName);
		if (eefElementEditorReadOnlyState && transportMQTTTopicName.isEnabled()) {
			transportMQTTTopicName.setEnabled(false);
			transportMQTTTopicName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTTopicName.isEnabled()) {
			transportMQTTTopicName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSubscriptionQOS()
	 * 
	 */
	public Enumerator getTransportMQTTSubscriptionQOS() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportMQTTSubscriptionQOS.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportMQTTSubscriptionQOS(Object input, Enumerator current)
	 */
	public void initTransportMQTTSubscriptionQOS(Object input, Enumerator current) {
		transportMQTTSubscriptionQOS.setInput(input);
		transportMQTTSubscriptionQOS.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(false);
			transportMQTTSubscriptionQOS.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSubscriptionQOS(Enumerator newValue)
	 * 
	 */
	public void setTransportMQTTSubscriptionQOS(Enumerator newValue) {
		transportMQTTSubscriptionQOS.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionQOS);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(false);
			transportMQTTSubscriptionQOS.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionQOS.isEnabled()) {
			transportMQTTSubscriptionQOS.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSessionClean()
	 * 
	 */
	public Boolean getTransportMQTTSessionClean() {
		return Boolean.valueOf(transportMQTTSessionClean.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSessionClean(Boolean newValue)
	 * 
	 */
	public void setTransportMQTTSessionClean(Boolean newValue) {
		if (newValue != null) {
			transportMQTTSessionClean.setSelection(newValue.booleanValue());
		} else {
			transportMQTTSessionClean.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSessionClean);
		if (eefElementEditorReadOnlyState && transportMQTTSessionClean.isEnabled()) {
			transportMQTTSessionClean.setEnabled(false);
			transportMQTTSessionClean.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSessionClean.isEnabled()) {
			transportMQTTSessionClean.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslEnable()
	 * 
	 */
	public String getTransportMQTTSslEnable() {
		return transportMQTTSslEnable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslEnable(String newValue)
	 * 
	 */
	public void setTransportMQTTSslEnable(String newValue) {
		if (newValue != null) {
			transportMQTTSslEnable.setText(newValue);
		} else {
			transportMQTTSslEnable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslEnable);
		if (eefElementEditorReadOnlyState && transportMQTTSslEnable.isEnabled()) {
			transportMQTTSslEnable.setEnabled(false);
			transportMQTTSslEnable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslEnable.isEnabled()) {
			transportMQTTSslEnable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTTemporaryStoreDirectory()
	 * 
	 */
	public String getTransportMQTTTemporaryStoreDirectory() {
		return transportMQTTTemporaryStoreDirectory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTTemporaryStoreDirectory(String newValue)
	 * 
	 */
	public void setTransportMQTTTemporaryStoreDirectory(String newValue) {
		if (newValue != null) {
			transportMQTTTemporaryStoreDirectory.setText(newValue);
		} else {
			transportMQTTTemporaryStoreDirectory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTTemporaryStoreDirectory);
		if (eefElementEditorReadOnlyState && transportMQTTTemporaryStoreDirectory.isEnabled()) {
			transportMQTTTemporaryStoreDirectory.setEnabled(false);
			transportMQTTTemporaryStoreDirectory.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTTemporaryStoreDirectory.isEnabled()) {
			transportMQTTTemporaryStoreDirectory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSubscriptionUsername()
	 * 
	 */
	public String getTransportMQTTSubscriptionUsername() {
		return transportMQTTSubscriptionUsername.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSubscriptionUsername(String newValue)
	 * 
	 */
	public void setTransportMQTTSubscriptionUsername(String newValue) {
		if (newValue != null) {
			transportMQTTSubscriptionUsername.setText(newValue);
		} else {
			transportMQTTSubscriptionUsername.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionUsername);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionUsername.isEnabled()) {
			transportMQTTSubscriptionUsername.setEnabled(false);
			transportMQTTSubscriptionUsername.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionUsername.isEnabled()) {
			transportMQTTSubscriptionUsername.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSubscriptionPassword()
	 * 
	 */
	public String getTransportMQTTSubscriptionPassword() {
		return transportMQTTSubscriptionPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSubscriptionPassword(String newValue)
	 * 
	 */
	public void setTransportMQTTSubscriptionPassword(String newValue) {
		if (newValue != null) {
			transportMQTTSubscriptionPassword.setText(newValue);
		} else {
			transportMQTTSubscriptionPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSubscriptionPassword);
		if (eefElementEditorReadOnlyState && transportMQTTSubscriptionPassword.isEnabled()) {
			transportMQTTSubscriptionPassword.setEnabled(false);
			transportMQTTSubscriptionPassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSubscriptionPassword.isEnabled()) {
			transportMQTTSubscriptionPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTClientId()
	 * 
	 */
	public String getTransportMQTTClientId() {
		return transportMQTTClientId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTClientId(String newValue)
	 * 
	 */
	public void setTransportMQTTClientId(String newValue) {
		if (newValue != null) {
			transportMQTTClientId.setText(newValue);
		} else {
			transportMQTTClientId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTClientId);
		if (eefElementEditorReadOnlyState && transportMQTTClientId.isEnabled()) {
			transportMQTTClientId.setEnabled(false);
			transportMQTTClientId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTClientId.isEnabled()) {
			transportMQTTClientId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTruststore()
	 * 
	 */
	public String getTruststore() {
		return truststore.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTruststore(String newValue)
	 * 
	 */
	public void setTruststore(String newValue) {
		if (newValue != null) {
			truststore.setText(newValue);
		} else {
			truststore.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.truststore);
		if (eefElementEditorReadOnlyState && truststore.isEnabled()) {
			truststore.setEnabled(false);
			truststore.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !truststore.isEnabled()) {
			truststore.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getKeystore()
	 * 
	 */
	public String getKeystore() {
		return keystore.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setKeystore(String newValue)
	 * 
	 */
	public void setKeystore(String newValue) {
		if (newValue != null) {
			keystore.setText(newValue);
		} else {
			keystore.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.keystore);
		if (eefElementEditorReadOnlyState && keystore.isEnabled()) {
			keystore.setEnabled(false);
			keystore.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !keystore.isEnabled()) {
			keystore.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSslVerifyClient()
	 * 
	 */
	public String getSslVerifyClient() {
		return sslVerifyClient.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSslVerifyClient(String newValue)
	 * 
	 */
	public void setSslVerifyClient(String newValue) {
		if (newValue != null) {
			sslVerifyClient.setText(newValue);
		} else {
			sslVerifyClient.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.sslVerifyClient);
		if (eefElementEditorReadOnlyState && sslVerifyClient.isEnabled()) {
			sslVerifyClient.setEnabled(false);
			sslVerifyClient.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sslVerifyClient.isEnabled()) {
			sslVerifyClient.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSslProtocol()
	 * 
	 */
	public String getSslProtocol() {
		return sslProtocol.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSslProtocol(String newValue)
	 * 
	 */
	public void setSslProtocol(String newValue) {
		if (newValue != null) {
			sslProtocol.setText(newValue);
		} else {
			sslProtocol.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.sslProtocol);
		if (eefElementEditorReadOnlyState && sslProtocol.isEnabled()) {
			sslProtocol.setEnabled(false);
			sslProtocol.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sslProtocol.isEnabled()) {
			sslProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getHttpsProtocols()
	 * 
	 */
	public String getHttpsProtocols() {
		return httpsProtocols.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setHttpsProtocols(String newValue)
	 * 
	 */
	public void setHttpsProtocols(String newValue) {
		if (newValue != null) {
			httpsProtocols.setText(newValue);
		} else {
			httpsProtocols.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.httpsProtocols);
		if (eefElementEditorReadOnlyState && httpsProtocols.isEnabled()) {
			httpsProtocols.setEnabled(false);
			httpsProtocols.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !httpsProtocols.isEnabled()) {
			httpsProtocols.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getCertificateRevocationVerifier()
	 * 
	 */
	public String getCertificateRevocationVerifier() {
		return certificateRevocationVerifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setCertificateRevocationVerifier(String newValue)
	 * 
	 */
	public void setCertificateRevocationVerifier(String newValue) {
		if (newValue != null) {
			certificateRevocationVerifier.setText(newValue);
		} else {
			certificateRevocationVerifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.certificateRevocationVerifier);
		if (eefElementEditorReadOnlyState && certificateRevocationVerifier.isEnabled()) {
			certificateRevocationVerifier.setEnabled(false);
			certificateRevocationVerifier.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !certificateRevocationVerifier.isEnabled()) {
			certificateRevocationVerifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7Port()
	 * 
	 */
	public String getInboundHL7Port() {
		return inboundHL7Port.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7Port(String newValue)
	 * 
	 */
	public void setInboundHL7Port(String newValue) {
		if (newValue != null) {
			inboundHL7Port.setText(newValue);
		} else {
			inboundHL7Port.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7Port);
		if (eefElementEditorReadOnlyState && inboundHL7Port.isEnabled()) {
			inboundHL7Port.setEnabled(false);
			inboundHL7Port.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7Port.isEnabled()) {
			inboundHL7Port.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7AutoAck()
	 * 
	 */
	public Boolean getInboundHL7AutoAck() {
		return Boolean.valueOf(inboundHL7AutoAck.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7AutoAck(Boolean newValue)
	 * 
	 */
	public void setInboundHL7AutoAck(Boolean newValue) {
		if (newValue != null) {
			inboundHL7AutoAck.setSelection(newValue.booleanValue());
		} else {
			inboundHL7AutoAck.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7AutoAck);
		if (eefElementEditorReadOnlyState && inboundHL7AutoAck.isEnabled()) {
			inboundHL7AutoAck.setEnabled(false);
			inboundHL7AutoAck.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7AutoAck.isEnabled()) {
			inboundHL7AutoAck.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7MessagePreProcessor()
	 * 
	 */
	public String getInboundHL7MessagePreProcessor() {
		return inboundHL7MessagePreProcessor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7MessagePreProcessor(String newValue)
	 * 
	 */
	public void setInboundHL7MessagePreProcessor(String newValue) {
		if (newValue != null) {
			inboundHL7MessagePreProcessor.setText(newValue);
		} else {
			inboundHL7MessagePreProcessor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7MessagePreProcessor);
		if (eefElementEditorReadOnlyState && inboundHL7MessagePreProcessor.isEnabled()) {
			inboundHL7MessagePreProcessor.setEnabled(false);
			inboundHL7MessagePreProcessor.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7MessagePreProcessor.isEnabled()) {
			inboundHL7MessagePreProcessor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7CharSet()
	 * 
	 */
	public String getInboundHL7CharSet() {
		return inboundHL7CharSet.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7CharSet(String newValue)
	 * 
	 */
	public void setInboundHL7CharSet(String newValue) {
		if (newValue != null) {
			inboundHL7CharSet.setText(newValue);
		} else {
			inboundHL7CharSet.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7CharSet);
		if (eefElementEditorReadOnlyState && inboundHL7CharSet.isEnabled()) {
			inboundHL7CharSet.setEnabled(false);
			inboundHL7CharSet.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7CharSet.isEnabled()) {
			inboundHL7CharSet.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7TimeOut()
	 * 
	 */
	public String getInboundHL7TimeOut() {
		return inboundHL7TimeOut.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7TimeOut(String newValue)
	 * 
	 */
	public void setInboundHL7TimeOut(String newValue) {
		if (newValue != null) {
			inboundHL7TimeOut.setText(newValue);
		} else {
			inboundHL7TimeOut.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7TimeOut);
		if (eefElementEditorReadOnlyState && inboundHL7TimeOut.isEnabled()) {
			inboundHL7TimeOut.setEnabled(false);
			inboundHL7TimeOut.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7TimeOut.isEnabled()) {
			inboundHL7TimeOut.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7ValidateMessage()
	 * 
	 */
	public Boolean getInboundHL7ValidateMessage() {
		return Boolean.valueOf(inboundHL7ValidateMessage.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7ValidateMessage(Boolean newValue)
	 * 
	 */
	public void setInboundHL7ValidateMessage(Boolean newValue) {
		if (newValue != null) {
			inboundHL7ValidateMessage.setSelection(newValue.booleanValue());
		} else {
			inboundHL7ValidateMessage.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7ValidateMessage);
		if (eefElementEditorReadOnlyState && inboundHL7ValidateMessage.isEnabled()) {
			inboundHL7ValidateMessage.setEnabled(false);
			inboundHL7ValidateMessage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7ValidateMessage.isEnabled()) {
			inboundHL7ValidateMessage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7BuildInvalidMessages()
	 * 
	 */
	public Boolean getInboundHL7BuildInvalidMessages() {
		return Boolean.valueOf(inboundHL7BuildInvalidMessages.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7BuildInvalidMessages(Boolean newValue)
	 * 
	 */
	public void setInboundHL7BuildInvalidMessages(Boolean newValue) {
		if (newValue != null) {
			inboundHL7BuildInvalidMessages.setSelection(newValue.booleanValue());
		} else {
			inboundHL7BuildInvalidMessages.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7BuildInvalidMessages);
		if (eefElementEditorReadOnlyState && inboundHL7BuildInvalidMessages.isEnabled()) {
			inboundHL7BuildInvalidMessages.setEnabled(false);
			inboundHL7BuildInvalidMessages.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7BuildInvalidMessages.isEnabled()) {
			inboundHL7BuildInvalidMessages.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundHL7PassThroughInvalidMessages()
	 * 
	 */
	public Boolean getInboundHL7PassThroughInvalidMessages() {
		return Boolean.valueOf(inboundHL7PassThroughInvalidMessages.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundHL7PassThroughInvalidMessages(Boolean newValue)
	 * 
	 */
	public void setInboundHL7PassThroughInvalidMessages(Boolean newValue) {
		if (newValue != null) {
			inboundHL7PassThroughInvalidMessages.setSelection(newValue.booleanValue());
		} else {
			inboundHL7PassThroughInvalidMessages.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundHL7PassThroughInvalidMessages);
		if (eefElementEditorReadOnlyState && inboundHL7PassThroughInvalidMessages.isEnabled()) {
			inboundHL7PassThroughInvalidMessages.setEnabled(false);
			inboundHL7PassThroughInvalidMessages.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundHL7PassThroughInvalidMessages.isEnabled()) {
			inboundHL7PassThroughInvalidMessages.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperConnect()
	 * 
	 */
	public String getZookeeperConnect() {
		return zookeeperConnect.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperConnect(String newValue)
	 * 
	 */
	public void setZookeeperConnect(String newValue) {
		if (newValue != null) {
			zookeeperConnect.setText(newValue);
		} else {
			zookeeperConnect.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnect);
		if (eefElementEditorReadOnlyState && zookeeperConnect.isEnabled()) {
			zookeeperConnect.setEnabled(false);
			zookeeperConnect.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperConnect.isEnabled()) {
			zookeeperConnect.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getGroupId()
	 * 
	 */
	public String getGroupId() {
		return groupId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setGroupId(String newValue)
	 * 
	 */
	public void setGroupId(String newValue) {
		if (newValue != null) {
			groupId.setText(newValue);
		} else {
			groupId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.groupId);
		if (eefElementEditorReadOnlyState && groupId.isEnabled()) {
			groupId.setEnabled(false);
			groupId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !groupId.isEnabled()) {
			groupId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getContentType()
	 * 
	 */
	public String getContentType() {
		return contentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setContentType(String newValue)
	 * 
	 */
	public void setContentType(String newValue) {
		if (newValue != null) {
			contentType.setText(newValue);
		} else {
			contentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.contentType);
		if (eefElementEditorReadOnlyState && contentType.isEnabled()) {
			contentType.setEnabled(false);
			contentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !contentType.isEnabled()) {
			contentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getConsumerType()
	 * 
	 */
	public Enumerator getConsumerType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) consumerType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initConsumerType(Object input, Enumerator current)
	 */
	public void initConsumerType(Object input, Enumerator current) {
		consumerType.setInput(input);
		consumerType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		if (eefElementEditorReadOnlyState && consumerType.isEnabled()) {
			consumerType.setEnabled(false);
			consumerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerType.isEnabled()) {
			consumerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setConsumerType(Enumerator newValue)
	 * 
	 */
	public void setConsumerType(Enumerator newValue) {
		consumerType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerType);
		if (eefElementEditorReadOnlyState && consumerType.isEnabled()) {
			consumerType.setEnabled(false);
			consumerType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerType.isEnabled()) {
			consumerType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicsOrTopicFilter()
	 * 
	 */
	public Enumerator getTopicsOrTopicFilter() {
		Enumerator selection = (Enumerator) ((StructuredSelection) topicsOrTopicFilter.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTopicsOrTopicFilter(Object input, Enumerator current)
	 */
	public void initTopicsOrTopicFilter(Object input, Enumerator current) {
		topicsOrTopicFilter.setInput(input);
		topicsOrTopicFilter.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		if (eefElementEditorReadOnlyState && topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(false);
			topicsOrTopicFilter.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicsOrTopicFilter(Enumerator newValue)
	 * 
	 */
	public void setTopicsOrTopicFilter(Enumerator newValue) {
		topicsOrTopicFilter.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicsOrTopicFilter);
		if (eefElementEditorReadOnlyState && topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(false);
			topicsOrTopicFilter.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicsOrTopicFilter.isEnabled()) {
			topicsOrTopicFilter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicsName()
	 * 
	 */
	public String getTopicsName() {
		return topicsName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicsName(String newValue)
	 * 
	 */
	public void setTopicsName(String newValue) {
		if (newValue != null) {
			topicsName.setText(newValue);
		} else {
			topicsName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicsName);
		if (eefElementEditorReadOnlyState && topicsName.isEnabled()) {
			topicsName.setEnabled(false);
			topicsName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicsName.isEnabled()) {
			topicsName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicFilterFrom()
	 * 
	 */
	public Enumerator getTopicFilterFrom() {
		Enumerator selection = (Enumerator) ((StructuredSelection) topicFilterFrom.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTopicFilterFrom(Object input, Enumerator current)
	 */
	public void initTopicFilterFrom(Object input, Enumerator current) {
		topicFilterFrom.setInput(input);
		topicFilterFrom.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		if (eefElementEditorReadOnlyState && topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(false);
			topicFilterFrom.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicFilterFrom(Enumerator newValue)
	 * 
	 */
	public void setTopicFilterFrom(Enumerator newValue) {
		topicFilterFrom.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicFilterFrom);
		if (eefElementEditorReadOnlyState && topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(false);
			topicFilterFrom.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicFilterFrom.isEnabled()) {
			topicFilterFrom.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTopicFilterName()
	 * 
	 */
	public String getTopicFilterName() {
		return topicFilterName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTopicFilterName(String newValue)
	 * 
	 */
	public void setTopicFilterName(String newValue) {
		if (newValue != null) {
			topicFilterName.setText(newValue);
		} else {
			topicFilterName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.topicFilterName);
		if (eefElementEditorReadOnlyState && topicFilterName.isEnabled()) {
			topicFilterName.setEnabled(false);
			topicFilterName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !topicFilterName.isEnabled()) {
			topicFilterName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerTopic()
	 * 
	 */
	public String getSimpleConsumerTopic() {
		return simpleConsumerTopic.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerTopic(String newValue)
	 * 
	 */
	public void setSimpleConsumerTopic(String newValue) {
		if (newValue != null) {
			simpleConsumerTopic.setText(newValue);
		} else {
			simpleConsumerTopic.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerTopic);
		if (eefElementEditorReadOnlyState && simpleConsumerTopic.isEnabled()) {
			simpleConsumerTopic.setEnabled(false);
			simpleConsumerTopic.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerTopic.isEnabled()) {
			simpleConsumerTopic.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerBrokers()
	 * 
	 */
	public String getSimpleConsumerBrokers() {
		return simpleConsumerBrokers.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerBrokers(String newValue)
	 * 
	 */
	public void setSimpleConsumerBrokers(String newValue) {
		if (newValue != null) {
			simpleConsumerBrokers.setText(newValue);
		} else {
			simpleConsumerBrokers.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerBrokers);
		if (eefElementEditorReadOnlyState && simpleConsumerBrokers.isEnabled()) {
			simpleConsumerBrokers.setEnabled(false);
			simpleConsumerBrokers.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerBrokers.isEnabled()) {
			simpleConsumerBrokers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerPort()
	 * 
	 */
	public String getSimpleConsumerPort() {
		return simpleConsumerPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerPort(String newValue)
	 * 
	 */
	public void setSimpleConsumerPort(String newValue) {
		if (newValue != null) {
			simpleConsumerPort.setText(newValue);
		} else {
			simpleConsumerPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPort);
		if (eefElementEditorReadOnlyState && simpleConsumerPort.isEnabled()) {
			simpleConsumerPort.setEnabled(false);
			simpleConsumerPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerPort.isEnabled()) {
			simpleConsumerPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerPartition()
	 * 
	 */
	public String getSimpleConsumerPartition() {
		return simpleConsumerPartition.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerPartition(String newValue)
	 * 
	 */
	public void setSimpleConsumerPartition(String newValue) {
		if (newValue != null) {
			simpleConsumerPartition.setText(newValue);
		} else {
			simpleConsumerPartition.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerPartition);
		if (eefElementEditorReadOnlyState && simpleConsumerPartition.isEnabled()) {
			simpleConsumerPartition.setEnabled(false);
			simpleConsumerPartition.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerPartition.isEnabled()) {
			simpleConsumerPartition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSimpleConsumerMaxMessagesToRead()
	 * 
	 */
	public String getSimpleConsumerMaxMessagesToRead() {
		return simpleConsumerMaxMessagesToRead.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSimpleConsumerMaxMessagesToRead(String newValue)
	 * 
	 */
	public void setSimpleConsumerMaxMessagesToRead(String newValue) {
		if (newValue != null) {
			simpleConsumerMaxMessagesToRead.setText(newValue);
		} else {
			simpleConsumerMaxMessagesToRead.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.simpleConsumerMaxMessagesToRead);
		if (eefElementEditorReadOnlyState && simpleConsumerMaxMessagesToRead.isEnabled()) {
			simpleConsumerMaxMessagesToRead.setEnabled(false);
			simpleConsumerMaxMessagesToRead.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !simpleConsumerMaxMessagesToRead.isEnabled()) {
			simpleConsumerMaxMessagesToRead.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getThreadCount()
	 * 
	 */
	public String getThreadCount() {
		return threadCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setThreadCount(String newValue)
	 * 
	 */
	public void setThreadCount(String newValue) {
		if (newValue != null) {
			threadCount.setText(newValue);
		} else {
			threadCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.threadCount);
		if (eefElementEditorReadOnlyState && threadCount.isEnabled()) {
			threadCount.setEnabled(false);
			threadCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !threadCount.isEnabled()) {
			threadCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getConsumerId()
	 * 
	 */
	public String getConsumerId() {
		return consumerId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setConsumerId(String newValue)
	 * 
	 */
	public void setConsumerId(String newValue) {
		if (newValue != null) {
			consumerId.setText(newValue);
		} else {
			consumerId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerId);
		if (eefElementEditorReadOnlyState && consumerId.isEnabled()) {
			consumerId.setEnabled(false);
			consumerId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerId.isEnabled()) {
			consumerId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSocketTimeoutMs()
	 * 
	 */
	public String getSocketTimeoutMs() {
		return socketTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSocketTimeoutMs(String newValue)
	 * 
	 */
	public void setSocketTimeoutMs(String newValue) {
		if (newValue != null) {
			socketTimeoutMs.setText(newValue);
		} else {
			socketTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.socketTimeoutMs);
		if (eefElementEditorReadOnlyState && socketTimeoutMs.isEnabled()) {
			socketTimeoutMs.setEnabled(false);
			socketTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !socketTimeoutMs.isEnabled()) {
			socketTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSocketReceiveBufferBytes()
	 * 
	 */
	public String getSocketReceiveBufferBytes() {
		return socketReceiveBufferBytes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSocketReceiveBufferBytes(String newValue)
	 * 
	 */
	public void setSocketReceiveBufferBytes(String newValue) {
		if (newValue != null) {
			socketReceiveBufferBytes.setText(newValue);
		} else {
			socketReceiveBufferBytes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.socketReceiveBufferBytes);
		if (eefElementEditorReadOnlyState && socketReceiveBufferBytes.isEnabled()) {
			socketReceiveBufferBytes.setEnabled(false);
			socketReceiveBufferBytes.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !socketReceiveBufferBytes.isEnabled()) {
			socketReceiveBufferBytes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getFetchMessageMaxBytes()
	 * 
	 */
	public String getFetchMessageMaxBytes() {
		return fetchMessageMaxBytes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setFetchMessageMaxBytes(String newValue)
	 * 
	 */
	public void setFetchMessageMaxBytes(String newValue) {
		if (newValue != null) {
			fetchMessageMaxBytes.setText(newValue);
		} else {
			fetchMessageMaxBytes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.fetchMessageMaxBytes);
		if (eefElementEditorReadOnlyState && fetchMessageMaxBytes.isEnabled()) {
			fetchMessageMaxBytes.setEnabled(false);
			fetchMessageMaxBytes.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fetchMessageMaxBytes.isEnabled()) {
			fetchMessageMaxBytes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getNumConsumerFetches()
	 * 
	 */
	public String getNumConsumerFetches() {
		return numConsumerFetches.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setNumConsumerFetches(String newValue)
	 * 
	 */
	public void setNumConsumerFetches(String newValue) {
		if (newValue != null) {
			numConsumerFetches.setText(newValue);
		} else {
			numConsumerFetches.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.numConsumerFetches);
		if (eefElementEditorReadOnlyState && numConsumerFetches.isEnabled()) {
			numConsumerFetches.setEnabled(false);
			numConsumerFetches.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !numConsumerFetches.isEnabled()) {
			numConsumerFetches.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getAutoCommitEnable()
	 * 
	 */
	public Boolean getAutoCommitEnable() {
		return Boolean.valueOf(autoCommitEnable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setAutoCommitEnable(Boolean newValue)
	 * 
	 */
	public void setAutoCommitEnable(Boolean newValue) {
		if (newValue != null) {
			autoCommitEnable.setSelection(newValue.booleanValue());
		} else {
			autoCommitEnable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoCommitEnable);
		if (eefElementEditorReadOnlyState && autoCommitEnable.isEnabled()) {
			autoCommitEnable.setEnabled(false);
			autoCommitEnable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoCommitEnable.isEnabled()) {
			autoCommitEnable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getAutoCommitIntervalMs()
	 * 
	 */
	public String getAutoCommitIntervalMs() {
		return autoCommitIntervalMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setAutoCommitIntervalMs(String newValue)
	 * 
	 */
	public void setAutoCommitIntervalMs(String newValue) {
		if (newValue != null) {
			autoCommitIntervalMs.setText(newValue);
		} else {
			autoCommitIntervalMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoCommitIntervalMs);
		if (eefElementEditorReadOnlyState && autoCommitIntervalMs.isEnabled()) {
			autoCommitIntervalMs.setEnabled(false);
			autoCommitIntervalMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoCommitIntervalMs.isEnabled()) {
			autoCommitIntervalMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getQueuedMaxMessageChunks()
	 * 
	 */
	public String getQueuedMaxMessageChunks() {
		return queuedMaxMessageChunks.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setQueuedMaxMessageChunks(String newValue)
	 * 
	 */
	public void setQueuedMaxMessageChunks(String newValue) {
		if (newValue != null) {
			queuedMaxMessageChunks.setText(newValue);
		} else {
			queuedMaxMessageChunks.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.queuedMaxMessageChunks);
		if (eefElementEditorReadOnlyState && queuedMaxMessageChunks.isEnabled()) {
			queuedMaxMessageChunks.setEnabled(false);
			queuedMaxMessageChunks.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !queuedMaxMessageChunks.isEnabled()) {
			queuedMaxMessageChunks.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getRebalanceMaxRetries()
	 * 
	 */
	public String getRebalanceMaxRetries() {
		return rebalanceMaxRetries.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setRebalanceMaxRetries(String newValue)
	 * 
	 */
	public void setRebalanceMaxRetries(String newValue) {
		if (newValue != null) {
			rebalanceMaxRetries.setText(newValue);
		} else {
			rebalanceMaxRetries.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.rebalanceMaxRetries);
		if (eefElementEditorReadOnlyState && rebalanceMaxRetries.isEnabled()) {
			rebalanceMaxRetries.setEnabled(false);
			rebalanceMaxRetries.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rebalanceMaxRetries.isEnabled()) {
			rebalanceMaxRetries.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getFetchMinBytes()
	 * 
	 */
	public String getFetchMinBytes() {
		return fetchMinBytes.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setFetchMinBytes(String newValue)
	 * 
	 */
	public void setFetchMinBytes(String newValue) {
		if (newValue != null) {
			fetchMinBytes.setText(newValue);
		} else {
			fetchMinBytes.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.fetchMinBytes);
		if (eefElementEditorReadOnlyState && fetchMinBytes.isEnabled()) {
			fetchMinBytes.setEnabled(false);
			fetchMinBytes.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fetchMinBytes.isEnabled()) {
			fetchMinBytes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getFetchWaitMaxMs()
	 * 
	 */
	public String getFetchWaitMaxMs() {
		return fetchWaitMaxMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setFetchWaitMaxMs(String newValue)
	 * 
	 */
	public void setFetchWaitMaxMs(String newValue) {
		if (newValue != null) {
			fetchWaitMaxMs.setText(newValue);
		} else {
			fetchWaitMaxMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.fetchWaitMaxMs);
		if (eefElementEditorReadOnlyState && fetchWaitMaxMs.isEnabled()) {
			fetchWaitMaxMs.setEnabled(false);
			fetchWaitMaxMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fetchWaitMaxMs.isEnabled()) {
			fetchWaitMaxMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getRebalanceBackoffMs()
	 * 
	 */
	public String getRebalanceBackoffMs() {
		return rebalanceBackoffMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setRebalanceBackoffMs(String newValue)
	 * 
	 */
	public void setRebalanceBackoffMs(String newValue) {
		if (newValue != null) {
			rebalanceBackoffMs.setText(newValue);
		} else {
			rebalanceBackoffMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.rebalanceBackoffMs);
		if (eefElementEditorReadOnlyState && rebalanceBackoffMs.isEnabled()) {
			rebalanceBackoffMs.setEnabled(false);
			rebalanceBackoffMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rebalanceBackoffMs.isEnabled()) {
			rebalanceBackoffMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getRefreshLeaderBackoffMs()
	 * 
	 */
	public String getRefreshLeaderBackoffMs() {
		return refreshLeaderBackoffMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setRefreshLeaderBackoffMs(String newValue)
	 * 
	 */
	public void setRefreshLeaderBackoffMs(String newValue) {
		if (newValue != null) {
			refreshLeaderBackoffMs.setText(newValue);
		} else {
			refreshLeaderBackoffMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.refreshLeaderBackoffMs);
		if (eefElementEditorReadOnlyState && refreshLeaderBackoffMs.isEnabled()) {
			refreshLeaderBackoffMs.setEnabled(false);
			refreshLeaderBackoffMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !refreshLeaderBackoffMs.isEnabled()) {
			refreshLeaderBackoffMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getAutoOffsetReset()
	 * 
	 */
	public Enumerator getAutoOffsetReset() {
		Enumerator selection = (Enumerator) ((StructuredSelection) autoOffsetReset.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initAutoOffsetReset(Object input, Enumerator current)
	 */
	public void initAutoOffsetReset(Object input, Enumerator current) {
		autoOffsetReset.setInput(input);
		autoOffsetReset.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		if (eefElementEditorReadOnlyState && autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(false);
			autoOffsetReset.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setAutoOffsetReset(Enumerator newValue)
	 * 
	 */
	public void setAutoOffsetReset(Enumerator newValue) {
		autoOffsetReset.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.autoOffsetReset);
		if (eefElementEditorReadOnlyState && autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(false);
			autoOffsetReset.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !autoOffsetReset.isEnabled()) {
			autoOffsetReset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getConsumerTimeoutMs()
	 * 
	 */
	public String getConsumerTimeoutMs() {
		return consumerTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setConsumerTimeoutMs(String newValue)
	 * 
	 */
	public void setConsumerTimeoutMs(String newValue) {
		if (newValue != null) {
			consumerTimeoutMs.setText(newValue);
		} else {
			consumerTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.consumerTimeoutMs);
		if (eefElementEditorReadOnlyState && consumerTimeoutMs.isEnabled()) {
			consumerTimeoutMs.setEnabled(false);
			consumerTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !consumerTimeoutMs.isEnabled()) {
			consumerTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getExcludeInternalTopics()
	 * 
	 */
	public Boolean getExcludeInternalTopics() {
		return Boolean.valueOf(excludeInternalTopics.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setExcludeInternalTopics(Boolean newValue)
	 * 
	 */
	public void setExcludeInternalTopics(Boolean newValue) {
		if (newValue != null) {
			excludeInternalTopics.setSelection(newValue.booleanValue());
		} else {
			excludeInternalTopics.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.excludeInternalTopics);
		if (eefElementEditorReadOnlyState && excludeInternalTopics.isEnabled()) {
			excludeInternalTopics.setEnabled(false);
			excludeInternalTopics.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !excludeInternalTopics.isEnabled()) {
			excludeInternalTopics.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getPartitionAssignmentStrategy()
	 * 
	 */
	public Enumerator getPartitionAssignmentStrategy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) partitionAssignmentStrategy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initPartitionAssignmentStrategy(Object input, Enumerator current)
	 */
	public void initPartitionAssignmentStrategy(Object input, Enumerator current) {
		partitionAssignmentStrategy.setInput(input);
		partitionAssignmentStrategy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		if (eefElementEditorReadOnlyState && partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(false);
			partitionAssignmentStrategy.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setPartitionAssignmentStrategy(Enumerator newValue)
	 * 
	 */
	public void setPartitionAssignmentStrategy(Enumerator newValue) {
		partitionAssignmentStrategy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.partitionAssignmentStrategy);
		if (eefElementEditorReadOnlyState && partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(false);
			partitionAssignmentStrategy.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !partitionAssignmentStrategy.isEnabled()) {
			partitionAssignmentStrategy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getClientId()
	 * 
	 */
	public String getClientId() {
		return clientId.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setClientId(String newValue)
	 * 
	 */
	public void setClientId(String newValue) {
		if (newValue != null) {
			clientId.setText(newValue);
		} else {
			clientId.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.clientId);
		if (eefElementEditorReadOnlyState && clientId.isEnabled()) {
			clientId.setEnabled(false);
			clientId.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clientId.isEnabled()) {
			clientId.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperSessionTimeoutMs()
	 * 
	 */
	public String getZookeeperSessionTimeoutMs() {
		return zookeeperSessionTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperSessionTimeoutMs(String newValue)
	 * 
	 */
	public void setZookeeperSessionTimeoutMs(String newValue) {
		if (newValue != null) {
			zookeeperSessionTimeoutMs.setText(newValue);
		} else {
			zookeeperSessionTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSessionTimeoutMs);
		if (eefElementEditorReadOnlyState && zookeeperSessionTimeoutMs.isEnabled()) {
			zookeeperSessionTimeoutMs.setEnabled(false);
			zookeeperSessionTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperSessionTimeoutMs.isEnabled()) {
			zookeeperSessionTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperConnectionTimeoutMs()
	 * 
	 */
	public String getZookeeperConnectionTimeoutMs() {
		return zookeeperConnectionTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperConnectionTimeoutMs(String newValue)
	 * 
	 */
	public void setZookeeperConnectionTimeoutMs(String newValue) {
		if (newValue != null) {
			zookeeperConnectionTimeoutMs.setText(newValue);
		} else {
			zookeeperConnectionTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperConnectionTimeoutMs);
		if (eefElementEditorReadOnlyState && zookeeperConnectionTimeoutMs.isEnabled()) {
			zookeeperConnectionTimeoutMs.setEnabled(false);
			zookeeperConnectionTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperConnectionTimeoutMs.isEnabled()) {
			zookeeperConnectionTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getZookeeperSyncTimeMs()
	 * 
	 */
	public String getZookeeperSyncTimeMs() {
		return zookeeperSyncTimeMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setZookeeperSyncTimeMs(String newValue)
	 * 
	 */
	public void setZookeeperSyncTimeMs(String newValue) {
		if (newValue != null) {
			zookeeperSyncTimeMs.setText(newValue);
		} else {
			zookeeperSyncTimeMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.zookeeperSyncTimeMs);
		if (eefElementEditorReadOnlyState && zookeeperSyncTimeMs.isEnabled()) {
			zookeeperSyncTimeMs.setEnabled(false);
			zookeeperSyncTimeMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !zookeeperSyncTimeMs.isEnabled()) {
			zookeeperSyncTimeMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsStorage()
	 * 
	 */
	public Enumerator getOffsetsStorage() {
		Enumerator selection = (Enumerator) ((StructuredSelection) offsetsStorage.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initOffsetsStorage(Object input, Enumerator current)
	 */
	public void initOffsetsStorage(Object input, Enumerator current) {
		offsetsStorage.setInput(input);
		offsetsStorage.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		if (eefElementEditorReadOnlyState && offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(false);
			offsetsStorage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsStorage(Enumerator newValue)
	 * 
	 */
	public void setOffsetsStorage(Enumerator newValue) {
		offsetsStorage.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsStorage);
		if (eefElementEditorReadOnlyState && offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(false);
			offsetsStorage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsStorage.isEnabled()) {
			offsetsStorage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsChannelBackoffMs()
	 * 
	 */
	public String getOffsetsChannelBackoffMs() {
		return offsetsChannelBackoffMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsChannelBackoffMs(String newValue)
	 * 
	 */
	public void setOffsetsChannelBackoffMs(String newValue) {
		if (newValue != null) {
			offsetsChannelBackoffMs.setText(newValue);
		} else {
			offsetsChannelBackoffMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelBackoffMs);
		if (eefElementEditorReadOnlyState && offsetsChannelBackoffMs.isEnabled()) {
			offsetsChannelBackoffMs.setEnabled(false);
			offsetsChannelBackoffMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsChannelBackoffMs.isEnabled()) {
			offsetsChannelBackoffMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsChannelSocketTimeoutMs()
	 * 
	 */
	public String getOffsetsChannelSocketTimeoutMs() {
		return offsetsChannelSocketTimeoutMs.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsChannelSocketTimeoutMs(String newValue)
	 * 
	 */
	public void setOffsetsChannelSocketTimeoutMs(String newValue) {
		if (newValue != null) {
			offsetsChannelSocketTimeoutMs.setText(newValue);
		} else {
			offsetsChannelSocketTimeoutMs.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsChannelSocketTimeoutMs);
		if (eefElementEditorReadOnlyState && offsetsChannelSocketTimeoutMs.isEnabled()) {
			offsetsChannelSocketTimeoutMs.setEnabled(false);
			offsetsChannelSocketTimeoutMs.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsChannelSocketTimeoutMs.isEnabled()) {
			offsetsChannelSocketTimeoutMs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getOffsetsCommitMaxRetries()
	 * 
	 */
	public String getOffsetsCommitMaxRetries() {
		return offsetsCommitMaxRetries.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setOffsetsCommitMaxRetries(String newValue)
	 * 
	 */
	public void setOffsetsCommitMaxRetries(String newValue) {
		if (newValue != null) {
			offsetsCommitMaxRetries.setText(newValue);
		} else {
			offsetsCommitMaxRetries.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.offsetsCommitMaxRetries);
		if (eefElementEditorReadOnlyState && offsetsCommitMaxRetries.isEnabled()) {
			offsetsCommitMaxRetries.setEnabled(false);
			offsetsCommitMaxRetries.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !offsetsCommitMaxRetries.isEnabled()) {
			offsetsCommitMaxRetries.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getDualCommitEnabled()
	 * 
	 */
	public Boolean getDualCommitEnabled() {
		return Boolean.valueOf(dualCommitEnabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setDualCommitEnabled(Boolean newValue)
	 * 
	 */
	public void setDualCommitEnabled(Boolean newValue) {
		if (newValue != null) {
			dualCommitEnabled.setSelection(newValue.booleanValue());
		} else {
			dualCommitEnabled.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.dualCommitEnabled);
		if (eefElementEditorReadOnlyState && dualCommitEnabled.isEnabled()) {
			dualCommitEnabled.setEnabled(false);
			dualCommitEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dualCommitEnabled.isEnabled()) {
			dualCommitEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundCxfRmHost()
	 * 
	 */
	public String getInboundCxfRmHost() {
		return inboundCxfRmHost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundCxfRmHost(String newValue)
	 * 
	 */
	public void setInboundCxfRmHost(String newValue) {
		if (newValue != null) {
			inboundCxfRmHost.setText(newValue);
		} else {
			inboundCxfRmHost.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmHost);
		if (eefElementEditorReadOnlyState && inboundCxfRmHost.isEnabled()) {
			inboundCxfRmHost.setEnabled(false);
			inboundCxfRmHost.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundCxfRmHost.isEnabled()) {
			inboundCxfRmHost.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundCxfRmPort()
	 * 
	 */
	public String getInboundCxfRmPort() {
		return inboundCxfRmPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundCxfRmPort(String newValue)
	 * 
	 */
	public void setInboundCxfRmPort(String newValue) {
		if (newValue != null) {
			inboundCxfRmPort.setText(newValue);
		} else {
			inboundCxfRmPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmPort);
		if (eefElementEditorReadOnlyState && inboundCxfRmPort.isEnabled()) {
			inboundCxfRmPort.setEnabled(false);
			inboundCxfRmPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundCxfRmPort.isEnabled()) {
			inboundCxfRmPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getInboundCxfRmConfigFile()
	 * 
	 */
	public String getInboundCxfRmConfigFile() {
		return inboundCxfRmConfigFile.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setInboundCxfRmConfigFile(String newValue)
	 * 
	 */
	public void setInboundCxfRmConfigFile(String newValue) {
		if (newValue != null) {
			inboundCxfRmConfigFile.setText(newValue);
		} else {
			inboundCxfRmConfigFile.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.inboundCxfRmConfigFile);
		if (eefElementEditorReadOnlyState && inboundCxfRmConfigFile.isEnabled()) {
			inboundCxfRmConfigFile.setEnabled(false);
			inboundCxfRmConfigFile.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundCxfRmConfigFile.isEnabled()) {
			inboundCxfRmConfigFile.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getEnableSSL()
	 * 
	 */
	public Boolean getEnableSSL() {
		return Boolean.valueOf(enableSSL.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setEnableSSL(Boolean newValue)
	 * 
	 */
	public void setEnableSSL(Boolean newValue) {
		if (newValue != null) {
			enableSSL.setSelection(newValue.booleanValue());
		} else {
			enableSSL.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.enableSSL);
		if (eefElementEditorReadOnlyState && enableSSL.isEnabled()) {
			enableSSL.setEnabled(false);
			enableSSL.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !enableSSL.isEnabled()) {
			enableSSL.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initServiceParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initServiceParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		serviceParameters.setContentProvider(contentProvider);
		serviceParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.serviceParameters);
		if (eefElementEditorReadOnlyState && serviceParameters.isEnabled()) {
			serviceParameters.setEnabled(false);
			serviceParameters.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !serviceParameters.isEnabled()) {
			serviceParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#updateServiceParameters()
	 * 
	 */
	public void updateServiceParameters() {
	serviceParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#addFilterServiceParameters(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServiceParameters(ViewerFilter filter) {
		serviceParametersFilters.add(filter);
		if (this.serviceParameters != null) {
			this.serviceParameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#addBusinessFilterServiceParameters(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServiceParameters(ViewerFilter filter) {
		serviceParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#isContainedInServiceParametersTable(EObject element)
	 * 
	 */
	public boolean isContainedInServiceParametersTable(EObject element) {
		return ((ReferencesTableSettings)serviceParameters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getSuspend()
	 * 
	 */
	public Boolean getSuspend() {
		return Boolean.valueOf(suspend.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setSuspend(Boolean newValue)
	 * 
	 */
	public void setSuspend(Boolean newValue) {
		if (newValue != null) {
			suspend.setSelection(newValue.booleanValue());
		} else {
			suspend.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.suspend);
		if (eefElementEditorReadOnlyState && suspend.isEnabled()) {
			suspend.setEnabled(false);
			suspend.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !suspend.isEnabled()) {
			suspend.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionFactory()
	 * 
	 */
	public String getTransportRabbitMqConnectionFactory() {
		return transportRabbitMqConnectionFactory.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionFactory(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionFactory(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionFactory.setText(newValue);
		} else {
			transportRabbitMqConnectionFactory.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionFactory);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionFactory.isEnabled()) {
			transportRabbitMqConnectionFactory.setEnabled(false);
			transportRabbitMqConnectionFactory.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionFactory.isEnabled()) {
			transportRabbitMqConnectionFactory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerHostName()
	 * 
	 */
	public String getTransportRabbitMqServerHostName() {
		return transportRabbitMqServerHostName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerHostName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerHostName(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerHostName.setText(newValue);
		} else {
			transportRabbitMqServerHostName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerHostName);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerHostName.isEnabled()) {
			transportRabbitMqServerHostName.setEnabled(false);
			transportRabbitMqServerHostName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerHostName.isEnabled()) {
			transportRabbitMqServerHostName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerPort()
	 * 
	 */
	public String getTransportRabbitMqServerPort() {
		return transportRabbitMqServerPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerPort(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerPort(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerPort.setText(newValue);
		} else {
			transportRabbitMqServerPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPort);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerPort.isEnabled()) {
			transportRabbitMqServerPort.setEnabled(false);
			transportRabbitMqServerPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerPort.isEnabled()) {
			transportRabbitMqServerPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerUserName()
	 * 
	 */
	public String getTransportRabbitMqServerUserName() {
		return transportRabbitMqServerUserName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerUserName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerUserName(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerUserName.setText(newValue);
		} else {
			transportRabbitMqServerUserName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerUserName);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerUserName.isEnabled()) {
			transportRabbitMqServerUserName.setEnabled(false);
			transportRabbitMqServerUserName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerUserName.isEnabled()) {
			transportRabbitMqServerUserName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerPassword()
	 * 
	 */
	public String getTransportRabbitMqServerPassword() {
		return transportRabbitMqServerPassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerPassword(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerPassword(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerPassword.setText(newValue);
		} else {
			transportRabbitMqServerPassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerPassword);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerPassword.isEnabled()) {
			transportRabbitMqServerPassword.setEnabled(false);
			transportRabbitMqServerPassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerPassword.isEnabled()) {
			transportRabbitMqServerPassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueName()
	 * 
	 */
	public String getTransportRabbitMqQueueName() {
		return transportRabbitMqQueueName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueName(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueName.setText(newValue);
		} else {
			transportRabbitMqQueueName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueName);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueName.isEnabled()) {
			transportRabbitMqQueueName.setEnabled(false);
			transportRabbitMqQueueName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueName.isEnabled()) {
			transportRabbitMqQueueName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeName()
	 * 
	 */
	public String getTransportRabbitMqExchangeName() {
		return transportRabbitMqExchangeName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeName(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeName(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeName.setText(newValue);
		} else {
			transportRabbitMqExchangeName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeName);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeName.isEnabled()) {
			transportRabbitMqExchangeName.setEnabled(false);
			transportRabbitMqExchangeName.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeName.isEnabled()) {
			transportRabbitMqExchangeName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueDurable()
	 * 
	 */
	public String getTransportRabbitMqQueueDurable() {
		return transportRabbitMqQueueDurable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueDurable(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueDurable(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueDurable.setText(newValue);
		} else {
			transportRabbitMqQueueDurable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDurable);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueDurable.isEnabled()) {
			transportRabbitMqQueueDurable.setEnabled(false);
			transportRabbitMqQueueDurable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueDurable.isEnabled()) {
			transportRabbitMqQueueDurable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueExclusive()
	 * 
	 */
	public String getTransportRabbitMqQueueExclusive() {
		return transportRabbitMqQueueExclusive.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueExclusive(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueExclusive(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueExclusive.setText(newValue);
		} else {
			transportRabbitMqQueueExclusive.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueExclusive);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueExclusive.isEnabled()) {
			transportRabbitMqQueueExclusive.setEnabled(false);
			transportRabbitMqQueueExclusive.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueExclusive.isEnabled()) {
			transportRabbitMqQueueExclusive.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueAutoDelete()
	 * 
	 */
	public String getTransportRabbitMqQueueAutoDelete() {
		return transportRabbitMqQueueAutoDelete.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueAutoDelete(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueAutoDelete(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueAutoDelete.setText(newValue);
		} else {
			transportRabbitMqQueueAutoDelete.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoDelete);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueAutoDelete.isEnabled()) {
			transportRabbitMqQueueAutoDelete.setEnabled(false);
			transportRabbitMqQueueAutoDelete.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueAutoDelete.isEnabled()) {
			transportRabbitMqQueueAutoDelete.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueAutoAck()
	 * 
	 */
	public String getTransportRabbitMqQueueAutoAck() {
		return transportRabbitMqQueueAutoAck.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueAutoAck(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueAutoAck(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueAutoAck.setText(newValue);
		} else {
			transportRabbitMqQueueAutoAck.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueAutoAck);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueAutoAck.isEnabled()) {
			transportRabbitMqQueueAutoAck.setEnabled(false);
			transportRabbitMqQueueAutoAck.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueAutoAck.isEnabled()) {
			transportRabbitMqQueueAutoAck.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueRoutingKey()
	 * 
	 */
	public String getTransportRabbitMqQueueRoutingKey() {
		return transportRabbitMqQueueRoutingKey.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueRoutingKey(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueRoutingKey(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueRoutingKey.setText(newValue);
		} else {
			transportRabbitMqQueueRoutingKey.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueRoutingKey);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueRoutingKey.isEnabled()) {
			transportRabbitMqQueueRoutingKey.setEnabled(false);
			transportRabbitMqQueueRoutingKey.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueRoutingKey.isEnabled()) {
			transportRabbitMqQueueRoutingKey.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqQueueDeliveryMode()
	 * 
	 */
	public String getTransportRabbitMqQueueDeliveryMode() {
		return transportRabbitMqQueueDeliveryMode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqQueueDeliveryMode(String newValue)
	 * 
	 */
	public void setTransportRabbitMqQueueDeliveryMode(String newValue) {
		if (newValue != null) {
			transportRabbitMqQueueDeliveryMode.setText(newValue);
		} else {
			transportRabbitMqQueueDeliveryMode.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqQueueDeliveryMode);
		if (eefElementEditorReadOnlyState && transportRabbitMqQueueDeliveryMode.isEnabled()) {
			transportRabbitMqQueueDeliveryMode.setEnabled(false);
			transportRabbitMqQueueDeliveryMode.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqQueueDeliveryMode.isEnabled()) {
			transportRabbitMqQueueDeliveryMode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeType()
	 * 
	 */
	public String getTransportRabbitMqExchangeType() {
		return transportRabbitMqExchangeType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeType(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeType.setText(newValue);
		} else {
			transportRabbitMqExchangeType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeType);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeType.isEnabled()) {
			transportRabbitMqExchangeType.setEnabled(false);
			transportRabbitMqExchangeType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeType.isEnabled()) {
			transportRabbitMqExchangeType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeDurable()
	 * 
	 */
	public String getTransportRabbitMqExchangeDurable() {
		return transportRabbitMqExchangeDurable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeDurable(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeDurable(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeDurable.setText(newValue);
		} else {
			transportRabbitMqExchangeDurable.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeDurable);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeDurable.isEnabled()) {
			transportRabbitMqExchangeDurable.setEnabled(false);
			transportRabbitMqExchangeDurable.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeDurable.isEnabled()) {
			transportRabbitMqExchangeDurable.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqExchangeAutoDelete()
	 * 
	 */
	public String getTransportRabbitMqExchangeAutoDelete() {
		return transportRabbitMqExchangeAutoDelete.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqExchangeAutoDelete(String newValue)
	 * 
	 */
	public void setTransportRabbitMqExchangeAutoDelete(String newValue) {
		if (newValue != null) {
			transportRabbitMqExchangeAutoDelete.setText(newValue);
		} else {
			transportRabbitMqExchangeAutoDelete.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqExchangeAutoDelete);
		if (eefElementEditorReadOnlyState && transportRabbitMqExchangeAutoDelete.isEnabled()) {
			transportRabbitMqExchangeAutoDelete.setEnabled(false);
			transportRabbitMqExchangeAutoDelete.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqExchangeAutoDelete.isEnabled()) {
			transportRabbitMqExchangeAutoDelete.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerVirtualHost()
	 * 
	 */
	public String getTransportRabbitMqServerVirtualHost() {
		return transportRabbitMqServerVirtualHost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerVirtualHost(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerVirtualHost(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerVirtualHost.setText(newValue);
		} else {
			transportRabbitMqServerVirtualHost.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerVirtualHost);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerVirtualHost.isEnabled()) {
			transportRabbitMqServerVirtualHost.setEnabled(false);
			transportRabbitMqServerVirtualHost.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerVirtualHost.isEnabled()) {
			transportRabbitMqServerVirtualHost.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqFactoryHeartbeat()
	 * 
	 */
	public String getTransportRabbitMqFactoryHeartbeat() {
		return transportRabbitMqFactoryHeartbeat.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqFactoryHeartbeat(String newValue)
	 * 
	 */
	public void setTransportRabbitMqFactoryHeartbeat(String newValue) {
		if (newValue != null) {
			transportRabbitMqFactoryHeartbeat.setText(newValue);
		} else {
			transportRabbitMqFactoryHeartbeat.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqFactoryHeartbeat);
		if (eefElementEditorReadOnlyState && transportRabbitMqFactoryHeartbeat.isEnabled()) {
			transportRabbitMqFactoryHeartbeat.setEnabled(false);
			transportRabbitMqFactoryHeartbeat.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqFactoryHeartbeat.isEnabled()) {
			transportRabbitMqFactoryHeartbeat.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslEnabled()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslEnabled() {
		return transportRabbitMqConnectionSslEnabled.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslEnabled(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslEnabled(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslEnabled.setText(newValue);
		} else {
			transportRabbitMqConnectionSslEnabled.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslEnabled);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslEnabled.isEnabled()) {
			transportRabbitMqConnectionSslEnabled.setEnabled(false);
			transportRabbitMqConnectionSslEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslEnabled.isEnabled()) {
			transportRabbitMqConnectionSslEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslKeystoreLocation()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslKeystoreLocation() {
		return transportRabbitMqConnectionSslKeystoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslKeystoreLocation(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslKeystoreLocation(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslKeystoreLocation.setText(newValue);
		} else {
			transportRabbitMqConnectionSslKeystoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreLocation);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslKeystoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreLocation.setEnabled(false);
			transportRabbitMqConnectionSslKeystoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslKeystoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslKeystoreType()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslKeystoreType() {
		return transportRabbitMqConnectionSslKeystoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslKeystoreType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslKeystoreType(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslKeystoreType.setText(newValue);
		} else {
			transportRabbitMqConnectionSslKeystoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystoreType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslKeystoreType.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreType.setEnabled(false);
			transportRabbitMqConnectionSslKeystoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslKeystoreType.isEnabled()) {
			transportRabbitMqConnectionSslKeystoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslKeystorePassword()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslKeystorePassword() {
		return transportRabbitMqConnectionSslKeystorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslKeystorePassword(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslKeystorePassword(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslKeystorePassword.setText(newValue);
		} else {
			transportRabbitMqConnectionSslKeystorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslKeystorePassword);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslKeystorePassword.isEnabled()) {
			transportRabbitMqConnectionSslKeystorePassword.setEnabled(false);
			transportRabbitMqConnectionSslKeystorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslKeystorePassword.isEnabled()) {
			transportRabbitMqConnectionSslKeystorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslTruststoreLocation()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslTruststoreLocation() {
		return transportRabbitMqConnectionSslTruststoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslTruststoreLocation(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslTruststoreLocation(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslTruststoreLocation.setText(newValue);
		} else {
			transportRabbitMqConnectionSslTruststoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreLocation);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslTruststoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreLocation.setEnabled(false);
			transportRabbitMqConnectionSslTruststoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslTruststoreLocation.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslTruststoreType()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslTruststoreType() {
		return transportRabbitMqConnectionSslTruststoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslTruststoreType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslTruststoreType(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslTruststoreType.setText(newValue);
		} else {
			transportRabbitMqConnectionSslTruststoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststoreType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslTruststoreType.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreType.setEnabled(false);
			transportRabbitMqConnectionSslTruststoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslTruststoreType.isEnabled()) {
			transportRabbitMqConnectionSslTruststoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslTruststorePassword()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslTruststorePassword() {
		return transportRabbitMqConnectionSslTruststorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslTruststorePassword(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslTruststorePassword(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslTruststorePassword.setText(newValue);
		} else {
			transportRabbitMqConnectionSslTruststorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslTruststorePassword);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslTruststorePassword.isEnabled()) {
			transportRabbitMqConnectionSslTruststorePassword.setEnabled(false);
			transportRabbitMqConnectionSslTruststorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslTruststorePassword.isEnabled()) {
			transportRabbitMqConnectionSslTruststorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionSslVersion()
	 * 
	 */
	public String getTransportRabbitMqConnectionSslVersion() {
		return transportRabbitMqConnectionSslVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionSslVersion(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionSslVersion(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionSslVersion.setText(newValue);
		} else {
			transportRabbitMqConnectionSslVersion.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionSslVersion);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionSslVersion.isEnabled()) {
			transportRabbitMqConnectionSslVersion.setEnabled(false);
			transportRabbitMqConnectionSslVersion.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionSslVersion.isEnabled()) {
			transportRabbitMqConnectionSslVersion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqMessageContentType()
	 * 
	 */
	public String getTransportRabbitMqMessageContentType() {
		return transportRabbitMqMessageContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqMessageContentType(String newValue)
	 * 
	 */
	public void setTransportRabbitMqMessageContentType(String newValue) {
		if (newValue != null) {
			transportRabbitMqMessageContentType.setText(newValue);
		} else {
			transportRabbitMqMessageContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqMessageContentType);
		if (eefElementEditorReadOnlyState && transportRabbitMqMessageContentType.isEnabled()) {
			transportRabbitMqMessageContentType.setEnabled(false);
			transportRabbitMqMessageContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqMessageContentType.isEnabled()) {
			transportRabbitMqMessageContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionRetryCount()
	 * 
	 */
	public String getTransportRabbitMqConnectionRetryCount() {
		return transportRabbitMqConnectionRetryCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionRetryCount(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionRetryCount(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionRetryCount.setText(newValue);
		} else {
			transportRabbitMqConnectionRetryCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryCount);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionRetryCount.isEnabled()) {
			transportRabbitMqConnectionRetryCount.setEnabled(false);
			transportRabbitMqConnectionRetryCount.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionRetryCount.isEnabled()) {
			transportRabbitMqConnectionRetryCount.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConnectionRetryInterval()
	 * 
	 */
	public String getTransportRabbitMqConnectionRetryInterval() {
		return transportRabbitMqConnectionRetryInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConnectionRetryInterval(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConnectionRetryInterval(String newValue) {
		if (newValue != null) {
			transportRabbitMqConnectionRetryInterval.setText(newValue);
		} else {
			transportRabbitMqConnectionRetryInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConnectionRetryInterval);
		if (eefElementEditorReadOnlyState && transportRabbitMqConnectionRetryInterval.isEnabled()) {
			transportRabbitMqConnectionRetryInterval.setEnabled(false);
			transportRabbitMqConnectionRetryInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConnectionRetryInterval.isEnabled()) {
			transportRabbitMqConnectionRetryInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqServerRetryInterval()
	 * 
	 */
	public String getTransportRabbitMqServerRetryInterval() {
		return transportRabbitMqServerRetryInterval.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqServerRetryInterval(String newValue)
	 * 
	 */
	public void setTransportRabbitMqServerRetryInterval(String newValue) {
		if (newValue != null) {
			transportRabbitMqServerRetryInterval.setText(newValue);
		} else {
			transportRabbitMqServerRetryInterval.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqServerRetryInterval);
		if (eefElementEditorReadOnlyState && transportRabbitMqServerRetryInterval.isEnabled()) {
			transportRabbitMqServerRetryInterval.setEnabled(false);
			transportRabbitMqServerRetryInterval.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqServerRetryInterval.isEnabled()) {
			transportRabbitMqServerRetryInterval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsInboundPort()
	 * 
	 */
	public String getWsInboundPort() {
		return wsInboundPort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsInboundPort(String newValue)
	 * 
	 */
	public void setWsInboundPort(String newValue) {
		if (newValue != null) {
			wsInboundPort.setText(newValue);
		} else {
			wsInboundPort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsInboundPort);
		if (eefElementEditorReadOnlyState && wsInboundPort.isEnabled()) {
			wsInboundPort.setEnabled(false);
			wsInboundPort.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsInboundPort.isEnabled()) {
			wsInboundPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsClientSideBroadcastLevel()
	 * 
	 */
	public Enumerator getWsClientSideBroadcastLevel() {
		Enumerator selection = (Enumerator) ((StructuredSelection) wsClientSideBroadcastLevel.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initWsClientSideBroadcastLevel(Object input, Enumerator current)
	 */
	public void initWsClientSideBroadcastLevel(Object input, Enumerator current) {
		wsClientSideBroadcastLevel.setInput(input);
		wsClientSideBroadcastLevel.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		if (eefElementEditorReadOnlyState && wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(false);
			wsClientSideBroadcastLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsClientSideBroadcastLevel(Enumerator newValue)
	 * 
	 */
	public void setWsClientSideBroadcastLevel(Enumerator newValue) {
		wsClientSideBroadcastLevel.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsClientSideBroadcastLevel);
		if (eefElementEditorReadOnlyState && wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(false);
			wsClientSideBroadcastLevel.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsClientSideBroadcastLevel.isEnabled()) {
			wsClientSideBroadcastLevel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsOutflowDispatchSequence()
	 * 
	 */
	public String getWsOutflowDispatchSequence() {
		return wsOutflowDispatchSequence.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsOutflowDispatchSequence(String newValue)
	 * 
	 */
	public void setWsOutflowDispatchSequence(String newValue) {
		if (newValue != null) {
			wsOutflowDispatchSequence.setText(newValue);
		} else {
			wsOutflowDispatchSequence.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchSequence);
		if (eefElementEditorReadOnlyState && wsOutflowDispatchSequence.isEnabled()) {
			wsOutflowDispatchSequence.setEnabled(false);
			wsOutflowDispatchSequence.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsOutflowDispatchSequence.isEnabled()) {
			wsOutflowDispatchSequence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsOutflowDispatchFaultSequence()
	 * 
	 */
	public String getWsOutflowDispatchFaultSequence() {
		return wsOutflowDispatchFaultSequence.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsOutflowDispatchFaultSequence(String newValue)
	 * 
	 */
	public void setWsOutflowDispatchFaultSequence(String newValue) {
		if (newValue != null) {
			wsOutflowDispatchFaultSequence.setText(newValue);
		} else {
			wsOutflowDispatchFaultSequence.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsOutflowDispatchFaultSequence);
		if (eefElementEditorReadOnlyState && wsOutflowDispatchFaultSequence.isEnabled()) {
			wsOutflowDispatchFaultSequence.setEnabled(false);
			wsOutflowDispatchFaultSequence.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsOutflowDispatchFaultSequence.isEnabled()) {
			wsOutflowDispatchFaultSequence.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsBossThreadPoolSize()
	 * 
	 */
	public String getWsBossThreadPoolSize() {
		return wsBossThreadPoolSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsBossThreadPoolSize(String newValue)
	 * 
	 */
	public void setWsBossThreadPoolSize(String newValue) {
		if (newValue != null) {
			wsBossThreadPoolSize.setText(newValue);
		} else {
			wsBossThreadPoolSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsBossThreadPoolSize);
		if (eefElementEditorReadOnlyState && wsBossThreadPoolSize.isEnabled()) {
			wsBossThreadPoolSize.setEnabled(false);
			wsBossThreadPoolSize.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsBossThreadPoolSize.isEnabled()) {
			wsBossThreadPoolSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsWorkerThreadPoolSize()
	 * 
	 */
	public String getWsWorkerThreadPoolSize() {
		return wsWorkerThreadPoolSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsWorkerThreadPoolSize(String newValue)
	 * 
	 */
	public void setWsWorkerThreadPoolSize(String newValue) {
		if (newValue != null) {
			wsWorkerThreadPoolSize.setText(newValue);
		} else {
			wsWorkerThreadPoolSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsWorkerThreadPoolSize);
		if (eefElementEditorReadOnlyState && wsWorkerThreadPoolSize.isEnabled()) {
			wsWorkerThreadPoolSize.setEnabled(false);
			wsWorkerThreadPoolSize.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsWorkerThreadPoolSize.isEnabled()) {
			wsWorkerThreadPoolSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsSubprotocolHandlerClass()
	 * 
	 */
	public String getWsSubprotocolHandlerClass() {
		return wsSubprotocolHandlerClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsSubprotocolHandlerClass(String newValue)
	 * 
	 */
	public void setWsSubprotocolHandlerClass(String newValue) {
		if (newValue != null) {
			wsSubprotocolHandlerClass.setText(newValue);
		} else {
			wsSubprotocolHandlerClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsSubprotocolHandlerClass);
		if (eefElementEditorReadOnlyState && wsSubprotocolHandlerClass.isEnabled()) {
			wsSubprotocolHandlerClass.setEnabled(false);
			wsSubprotocolHandlerClass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsSubprotocolHandlerClass.isEnabled()) {
			wsSubprotocolHandlerClass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsPipelineHandlerClass()
	 * 
	 */
	public String getWsPipelineHandlerClass() {
		return wsPipelineHandlerClass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsPipelineHandlerClass(String newValue)
	 * 
	 */
	public void setWsPipelineHandlerClass(String newValue) {
		if (newValue != null) {
			wsPipelineHandlerClass.setText(newValue);
		} else {
			wsPipelineHandlerClass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsPipelineHandlerClass);
		if (eefElementEditorReadOnlyState && wsPipelineHandlerClass.isEnabled()) {
			wsPipelineHandlerClass.setEnabled(false);
			wsPipelineHandlerClass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsPipelineHandlerClass.isEnabled()) {
			wsPipelineHandlerClass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportFeedURL()
	 * 
	 */
	public String getTransportFeedURL() {
		return transportFeedURL.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportFeedURL(String newValue)
	 * 
	 */
	public void setTransportFeedURL(String newValue) {
		if (newValue != null) {
			transportFeedURL.setText(newValue);
		} else {
			transportFeedURL.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportFeedURL);
		if (eefElementEditorReadOnlyState && transportFeedURL.isEnabled()) {
			transportFeedURL.setEnabled(false);
			transportFeedURL.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportFeedURL.isEnabled()) {
			transportFeedURL.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportFeedType()
	 * 
	 */
	public Enumerator getTransportFeedType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportFeedType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportFeedType(Object input, Enumerator current)
	 */
	public void initTransportFeedType(Object input, Enumerator current) {
		transportFeedType.setInput(input);
		transportFeedType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		if (eefElementEditorReadOnlyState && transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(false);
			transportFeedType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportFeedType(Enumerator newValue)
	 * 
	 */
	public void setTransportFeedType(Enumerator newValue) {
		transportFeedType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportFeedType);
		if (eefElementEditorReadOnlyState && transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(false);
			transportFeedType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportFeedType.isEnabled()) {
			transportFeedType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTraceEnabled()
	 * 
	 */
	public Boolean getTraceEnabled() {
		return Boolean.valueOf(traceEnabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTraceEnabled(Boolean newValue)
	 * 
	 */
	public void setTraceEnabled(Boolean newValue) {
		if (newValue != null) {
			traceEnabled.setSelection(newValue.booleanValue());
		} else {
			traceEnabled.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.traceEnabled);
		if (eefElementEditorReadOnlyState && traceEnabled.isEnabled()) {
			traceEnabled.setEnabled(false);
			traceEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !traceEnabled.isEnabled()) {
			traceEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getStatisticsEnabled()
	 * 
	 */
	public Boolean getStatisticsEnabled() {
		return Boolean.valueOf(statisticsEnabled.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setStatisticsEnabled(Boolean newValue)
	 * 
	 */
	public void setStatisticsEnabled(Boolean newValue) {
		if (newValue != null) {
			statisticsEnabled.setSelection(newValue.booleanValue());
		} else {
			statisticsEnabled.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.statisticsEnabled);
		if (eefElementEditorReadOnlyState && statisticsEnabled.isEnabled()) {
			statisticsEnabled.setEnabled(false);
			statisticsEnabled.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !statisticsEnabled.isEnabled()) {
			statisticsEnabled.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSRetriesBeforeSuspension()
	 * 
	 */
	public String getTransportJMSRetriesBeforeSuspension() {
		return transportJMSRetriesBeforeSuspension.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSRetriesBeforeSuspension(String newValue)
	 * 
	 */
	public void setTransportJMSRetriesBeforeSuspension(String newValue) {
		if (newValue != null) {
			transportJMSRetriesBeforeSuspension.setText(newValue);
		} else {
			transportJMSRetriesBeforeSuspension.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSRetriesBeforeSuspension);
		if (eefElementEditorReadOnlyState && transportJMSRetriesBeforeSuspension.isEnabled()) {
			transportJMSRetriesBeforeSuspension.setEnabled(false);
			transportJMSRetriesBeforeSuspension.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSRetriesBeforeSuspension.isEnabled()) {
			transportJMSRetriesBeforeSuspension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSResetConnectionOnPollingSuspension()
	 * 
	 */
	public Boolean getTransportJMSResetConnectionOnPollingSuspension() {
		return Boolean.valueOf(transportJMSResetConnectionOnPollingSuspension.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSResetConnectionOnPollingSuspension(Boolean newValue)
	 * 
	 */
	public void setTransportJMSResetConnectionOnPollingSuspension(Boolean newValue) {
		if (newValue != null) {
			transportJMSResetConnectionOnPollingSuspension.setSelection(newValue.booleanValue());
		} else {
			transportJMSResetConnectionOnPollingSuspension.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSResetConnectionOnPollingSuspension);
		if (eefElementEditorReadOnlyState && transportJMSResetConnectionOnPollingSuspension.isEnabled()) {
			transportJMSResetConnectionOnPollingSuspension.setEnabled(false);
			transportJMSResetConnectionOnPollingSuspension.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSResetConnectionOnPollingSuspension.isEnabled()) {
			transportJMSResetConnectionOnPollingSuspension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSPollingSuspensionPeriod()
	 * 
	 */
	public String getTransportJMSPollingSuspensionPeriod() {
		return transportJMSPollingSuspensionPeriod.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSPollingSuspensionPeriod(String newValue)
	 * 
	 */
	public void setTransportJMSPollingSuspensionPeriod(String newValue) {
		if (newValue != null) {
			transportJMSPollingSuspensionPeriod.setText(newValue);
		} else {
			transportJMSPollingSuspensionPeriod.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSPollingSuspensionPeriod);
		if (eefElementEditorReadOnlyState && transportJMSPollingSuspensionPeriod.isEnabled()) {
			transportJMSPollingSuspensionPeriod.setEnabled(false);
			transportJMSPollingSuspensionPeriod.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSPollingSuspensionPeriod.isEnabled()) {
			transportJMSPollingSuspensionPeriod.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslKeystoreLocation()
	 * 
	 */
	public String getTransportMQTTSslKeystoreLocation() {
		return transportMQTTSslKeystoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslKeystoreLocation(String newValue)
	 * 
	 */
	public void setTransportMQTTSslKeystoreLocation(String newValue) {
		if (newValue != null) {
			transportMQTTSslKeystoreLocation.setText(newValue);
		} else {
			transportMQTTSslKeystoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreLocation);
		if (eefElementEditorReadOnlyState && transportMQTTSslKeystoreLocation.isEnabled()) {
			transportMQTTSslKeystoreLocation.setEnabled(false);
			transportMQTTSslKeystoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslKeystoreLocation.isEnabled()) {
			transportMQTTSslKeystoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslKeystoreType()
	 * 
	 */
	public String getTransportMQTTSslKeystoreType() {
		return transportMQTTSslKeystoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslKeystoreType(String newValue)
	 * 
	 */
	public void setTransportMQTTSslKeystoreType(String newValue) {
		if (newValue != null) {
			transportMQTTSslKeystoreType.setText(newValue);
		} else {
			transportMQTTSslKeystoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystoreType);
		if (eefElementEditorReadOnlyState && transportMQTTSslKeystoreType.isEnabled()) {
			transportMQTTSslKeystoreType.setEnabled(false);
			transportMQTTSslKeystoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslKeystoreType.isEnabled()) {
			transportMQTTSslKeystoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslKeystorePassword()
	 * 
	 */
	public String getTransportMQTTSslKeystorePassword() {
		return transportMQTTSslKeystorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslKeystorePassword(String newValue)
	 * 
	 */
	public void setTransportMQTTSslKeystorePassword(String newValue) {
		if (newValue != null) {
			transportMQTTSslKeystorePassword.setText(newValue);
		} else {
			transportMQTTSslKeystorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslKeystorePassword);
		if (eefElementEditorReadOnlyState && transportMQTTSslKeystorePassword.isEnabled()) {
			transportMQTTSslKeystorePassword.setEnabled(false);
			transportMQTTSslKeystorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslKeystorePassword.isEnabled()) {
			transportMQTTSslKeystorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslTruststoreLocation()
	 * 
	 */
	public String getTransportMQTTSslTruststoreLocation() {
		return transportMQTTSslTruststoreLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslTruststoreLocation(String newValue)
	 * 
	 */
	public void setTransportMQTTSslTruststoreLocation(String newValue) {
		if (newValue != null) {
			transportMQTTSslTruststoreLocation.setText(newValue);
		} else {
			transportMQTTSslTruststoreLocation.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreLocation);
		if (eefElementEditorReadOnlyState && transportMQTTSslTruststoreLocation.isEnabled()) {
			transportMQTTSslTruststoreLocation.setEnabled(false);
			transportMQTTSslTruststoreLocation.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslTruststoreLocation.isEnabled()) {
			transportMQTTSslTruststoreLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslTruststoreType()
	 * 
	 */
	public String getTransportMQTTSslTruststoreType() {
		return transportMQTTSslTruststoreType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslTruststoreType(String newValue)
	 * 
	 */
	public void setTransportMQTTSslTruststoreType(String newValue) {
		if (newValue != null) {
			transportMQTTSslTruststoreType.setText(newValue);
		} else {
			transportMQTTSslTruststoreType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststoreType);
		if (eefElementEditorReadOnlyState && transportMQTTSslTruststoreType.isEnabled()) {
			transportMQTTSslTruststoreType.setEnabled(false);
			transportMQTTSslTruststoreType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslTruststoreType.isEnabled()) {
			transportMQTTSslTruststoreType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslTruststorePassword()
	 * 
	 */
	public String getTransportMQTTSslTruststorePassword() {
		return transportMQTTSslTruststorePassword.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslTruststorePassword(String newValue)
	 * 
	 */
	public void setTransportMQTTSslTruststorePassword(String newValue) {
		if (newValue != null) {
			transportMQTTSslTruststorePassword.setText(newValue);
		} else {
			transportMQTTSslTruststorePassword.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslTruststorePassword);
		if (eefElementEditorReadOnlyState && transportMQTTSslTruststorePassword.isEnabled()) {
			transportMQTTSslTruststorePassword.setEnabled(false);
			transportMQTTSslTruststorePassword.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslTruststorePassword.isEnabled()) {
			transportMQTTSslTruststorePassword.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportMQTTSslVersion()
	 * 
	 */
	public String getTransportMQTTSslVersion() {
		return transportMQTTSslVersion.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportMQTTSslVersion(String newValue)
	 * 
	 */
	public void setTransportMQTTSslVersion(String newValue) {
		if (newValue != null) {
			transportMQTTSslVersion.setText(newValue);
		} else {
			transportMQTTSslVersion.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportMQTTSslVersion);
		if (eefElementEditorReadOnlyState && transportMQTTSslVersion.isEnabled()) {
			transportMQTTSslVersion.setEnabled(false);
			transportMQTTSslVersion.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportMQTTSslVersion.isEnabled()) {
			transportMQTTSslVersion.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslKeyStoreFile()
	 * 
	 */
	public String getWssSslKeyStoreFile() {
		return wssSslKeyStoreFile.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslKeyStoreFile(String newValue)
	 * 
	 */
	public void setWssSslKeyStoreFile(String newValue) {
		if (newValue != null) {
			wssSslKeyStoreFile.setText(newValue);
		} else {
			wssSslKeyStoreFile.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStoreFile);
		if (eefElementEditorReadOnlyState && wssSslKeyStoreFile.isEnabled()) {
			wssSslKeyStoreFile.setEnabled(false);
			wssSslKeyStoreFile.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslKeyStoreFile.isEnabled()) {
			wssSslKeyStoreFile.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslKeyStorePass()
	 * 
	 */
	public String getWssSslKeyStorePass() {
		return wssSslKeyStorePass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslKeyStorePass(String newValue)
	 * 
	 */
	public void setWssSslKeyStorePass(String newValue) {
		if (newValue != null) {
			wssSslKeyStorePass.setText(newValue);
		} else {
			wssSslKeyStorePass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslKeyStorePass);
		if (eefElementEditorReadOnlyState && wssSslKeyStorePass.isEnabled()) {
			wssSslKeyStorePass.setEnabled(false);
			wssSslKeyStorePass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslKeyStorePass.isEnabled()) {
			wssSslKeyStorePass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslTrustStoreFile()
	 * 
	 */
	public String getWssSslTrustStoreFile() {
		return wssSslTrustStoreFile.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslTrustStoreFile(String newValue)
	 * 
	 */
	public void setWssSslTrustStoreFile(String newValue) {
		if (newValue != null) {
			wssSslTrustStoreFile.setText(newValue);
		} else {
			wssSslTrustStoreFile.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStoreFile);
		if (eefElementEditorReadOnlyState && wssSslTrustStoreFile.isEnabled()) {
			wssSslTrustStoreFile.setEnabled(false);
			wssSslTrustStoreFile.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslTrustStoreFile.isEnabled()) {
			wssSslTrustStoreFile.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslTrustStorePass()
	 * 
	 */
	public String getWssSslTrustStorePass() {
		return wssSslTrustStorePass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslTrustStorePass(String newValue)
	 * 
	 */
	public void setWssSslTrustStorePass(String newValue) {
		if (newValue != null) {
			wssSslTrustStorePass.setText(newValue);
		} else {
			wssSslTrustStorePass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslTrustStorePass);
		if (eefElementEditorReadOnlyState && wssSslTrustStorePass.isEnabled()) {
			wssSslTrustStorePass.setEnabled(false);
			wssSslTrustStorePass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslTrustStorePass.isEnabled()) {
			wssSslTrustStorePass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslCertPass()
	 * 
	 */
	public String getWssSslCertPass() {
		return wssSslCertPass.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslCertPass(String newValue)
	 * 
	 */
	public void setWssSslCertPass(String newValue) {
		if (newValue != null) {
			wssSslCertPass.setText(newValue);
		} else {
			wssSslCertPass.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslCertPass);
		if (eefElementEditorReadOnlyState && wssSslCertPass.isEnabled()) {
			wssSslCertPass.setEnabled(false);
			wssSslCertPass.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslCertPass.isEnabled()) {
			wssSslCertPass.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsDefaultContentType()
	 * 
	 */
	public String getWsDefaultContentType() {
		return wsDefaultContentType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsDefaultContentType(String newValue)
	 * 
	 */
	public void setWsDefaultContentType(String newValue) {
		if (newValue != null) {
			wsDefaultContentType.setText(newValue);
		} else {
			wsDefaultContentType.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsDefaultContentType);
		if (eefElementEditorReadOnlyState && wsDefaultContentType.isEnabled()) {
			wsDefaultContentType.setEnabled(false);
			wsDefaultContentType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsDefaultContentType.isEnabled()) {
			wsDefaultContentType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsShutdownStatusCode()
	 * 
	 */
	public String getWsShutdownStatusCode() {
		return wsShutdownStatusCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsShutdownStatusCode(String newValue)
	 * 
	 */
	public void setWsShutdownStatusCode(String newValue) {
		if (newValue != null) {
			wsShutdownStatusCode.setText(newValue);
		} else {
			wsShutdownStatusCode.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusCode);
		if (eefElementEditorReadOnlyState && wsShutdownStatusCode.isEnabled()) {
			wsShutdownStatusCode.setEnabled(false);
			wsShutdownStatusCode.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsShutdownStatusCode.isEnabled()) {
			wsShutdownStatusCode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsShutdownStatusMessage()
	 * 
	 */
	public String getWsShutdownStatusMessage() {
		return wsShutdownStatusMessage.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsShutdownStatusMessage(String newValue)
	 * 
	 */
	public void setWsShutdownStatusMessage(String newValue) {
		if (newValue != null) {
			wsShutdownStatusMessage.setText(newValue);
		} else {
			wsShutdownStatusMessage.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsShutdownStatusMessage);
		if (eefElementEditorReadOnlyState && wsShutdownStatusMessage.isEnabled()) {
			wsShutdownStatusMessage.setEnabled(false);
			wsShutdownStatusMessage.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsShutdownStatusMessage.isEnabled()) {
			wsShutdownStatusMessage.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWsUsePortOffset()
	 * 
	 */
	public Boolean getWsUsePortOffset() {
		return Boolean.valueOf(wsUsePortOffset.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWsUsePortOffset(Boolean newValue)
	 * 
	 */
	public void setWsUsePortOffset(Boolean newValue) {
		if (newValue != null) {
			wsUsePortOffset.setSelection(newValue.booleanValue());
		} else {
			wsUsePortOffset.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wsUsePortOffset);
		if (eefElementEditorReadOnlyState && wsUsePortOffset.isEnabled()) {
			wsUsePortOffset.setEnabled(false);
			wsUsePortOffset.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wsUsePortOffset.isEnabled()) {
			wsUsePortOffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslProtocols()
	 * 
	 */
	public String getWssSslProtocols() {
		return wssSslProtocols.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslProtocols(String newValue)
	 * 
	 */
	public void setWssSslProtocols(String newValue) {
		if (newValue != null) {
			wssSslProtocols.setText(newValue);
		} else {
			wssSslProtocols.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslProtocols);
		if (eefElementEditorReadOnlyState && wssSslProtocols.isEnabled()) {
			wssSslProtocols.setEnabled(false);
			wssSslProtocols.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslProtocols.isEnabled()) {
			wssSslProtocols.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getWssSslCipherSuites()
	 * 
	 */
	public String getWssSslCipherSuites() {
		return wssSslCipherSuites.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setWssSslCipherSuites(String newValue)
	 * 
	 */
	public void setWssSslCipherSuites(String newValue) {
		if (newValue != null) {
			wssSslCipherSuites.setText(newValue);
		} else {
			wssSslCipherSuites.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.wssSslCipherSuites);
		if (eefElementEditorReadOnlyState && wssSslCipherSuites.isEnabled()) {
			wssSslCipherSuites.setEnabled(false);
			wssSslCipherSuites.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !wssSslCipherSuites.isEnabled()) {
			wssSslCipherSuites.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConsumerQos()
	 * 
	 */
	public String getTransportRabbitMqConsumerQos() {
		return transportRabbitMqConsumerQos.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConsumerQos(String newValue)
	 * 
	 */
	public void setTransportRabbitMqConsumerQos(String newValue) {
		if (newValue != null) {
			transportRabbitMqConsumerQos.setText(newValue);
		} else {
			transportRabbitMqConsumerQos.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQos);
		if (eefElementEditorReadOnlyState && transportRabbitMqConsumerQos.isEnabled()) {
			transportRabbitMqConsumerQos.setEnabled(false);
			transportRabbitMqConsumerQos.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConsumerQos.isEnabled()) {
			transportRabbitMqConsumerQos.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportRabbitMqConsumerQosType()
	 * 
	 */
	public Enumerator getTransportRabbitMqConsumerQosType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transportRabbitMqConsumerQosType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#initTransportRabbitMqConsumerQosType(Object input, Enumerator current)
	 */
	public void initTransportRabbitMqConsumerQosType(Object input, Enumerator current) {
		transportRabbitMqConsumerQosType.setInput(input);
		transportRabbitMqConsumerQosType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(false);
			transportRabbitMqConsumerQosType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportRabbitMqConsumerQosType(Enumerator newValue)
	 * 
	 */
	public void setTransportRabbitMqConsumerQosType(Enumerator newValue) {
		transportRabbitMqConsumerQosType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportRabbitMqConsumerQosType);
		if (eefElementEditorReadOnlyState && transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(false);
			transportRabbitMqConsumerQosType.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportRabbitMqConsumerQosType.isEnabled()) {
			transportRabbitMqConsumerQosType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#getTransportJMSDBUrl()
	 * 
	 */
	public String getTransportJMSDBUrl() {
		return transportJMSDBUrl.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.developerstudio.eclipse.gmf.esb.parts.InboundEndpointPropertiesEditionPart#setTransportJMSDBUrl(String newValue)
	 * 
	 */
	public void setTransportJMSDBUrl(String newValue) {
		if (newValue != null) {
			transportJMSDBUrl.setText(newValue);
		} else {
			transportJMSDBUrl.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpoint.Properties.transportJMSDBUrl);
		if (eefElementEditorReadOnlyState && transportJMSDBUrl.isEnabled()) {
			transportJMSDBUrl.setEnabled(false);
			transportJMSDBUrl.setToolTipText(EsbMessages.InboundEndpoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transportJMSDBUrl.isEnabled()) {
			transportJMSDBUrl.setEnabled(true);
		}	
		
	}






	// Start of user code for transportRabbitMqConsumerQosKey specific getters and setters implementation
	
	// End of user code

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.InboundEndpoint_Part_Title;
	}



	// Start of user code additional methods
    @Override
    public RegistryKeyProperty getRabbitMqConsumerQosKey() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setRabbitMqConsumerQosKey(RegistryKeyProperty registryKeyProperty) {
        // TODO Auto-generated method stub
        
    }
	// End of user code


}
