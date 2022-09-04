.class public Lcom/google/android/gms/cast/MediaQueueItem$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/MediaQueueItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/cast/MediaQueueItem;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/MediaInfo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/MediaQueueItem;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/cast/MediaQueueItem;-><init>(Lcom/google/android/gms/cast/MediaInfo;Lcom/google/android/gms/cast/MediaQueueItem$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/cast/MediaQueueItem;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/MediaQueueItem;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/cast/MediaQueueItem;-><init>(Lcom/google/android/gms/cast/MediaQueueItem;Lcom/google/android/gms/cast/MediaQueueItem$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-direct {v0, p1}, Lcom/google/android/gms/cast/MediaQueueItem;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/MediaQueueItem;->a(I)V

    return-object p0
.end method

.method public a(D)Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/cast/MediaQueueItem;->a(D)V

    return-object p0
.end method

.method public a(Lorg/json/JSONObject;)Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaQueueItem;->b(Lorg/json/JSONObject;)V

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaQueueItem;->a(Z)V

    return-object p0
.end method

.method public a([J)Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaQueueItem;->a([J)V

    return-object p0
.end method

.method public b(D)Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/cast/MediaQueueItem;->b(D)V

    return-object p0
.end method

.method public b()Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaQueueItem;->j()V

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    return-object v0
.end method

.method public c(D)Lcom/google/android/gms/cast/MediaQueueItem$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaQueueItem$a;->a:Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/cast/MediaQueueItem;->c(D)V

    return-object p0
.end method
