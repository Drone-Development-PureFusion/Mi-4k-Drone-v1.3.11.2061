.class public Lcom/tencent/open/utils/HttpUtils$NetworkProxy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/utils/HttpUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NetworkProxy"
.end annotation


# instance fields
.field public final host:Ljava/lang/String;

.field public final port:I


# direct methods
.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;->host:Ljava/lang/String;

    iput p2, p0, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;->port:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/tencent/open/utils/HttpUtils$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/tencent/open/utils/HttpUtils$NetworkProxy;-><init>(Ljava/lang/String;I)V

    return-void
.end method
