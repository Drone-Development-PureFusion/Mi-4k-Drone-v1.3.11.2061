.class final Lcom/google/android/gms/internal/agz$d;
.super Lcom/google/android/gms/internal/agz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/agz$c",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/clearcut/LogEventParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/clearcut/LogEventParcelable;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/agz$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/agz$d;->a:Lcom/google/android/gms/clearcut/LogEventParcelable;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aha;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agz$d;->a(Lcom/google/android/gms/internal/aha;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aha;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/agz$d$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/agz$d$1;-><init>(Lcom/google/android/gms/internal/agz$d;)V

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/agz$d;->a:Lcom/google/android/gms/clearcut/LogEventParcelable;

    invoke-static {v1}, Lcom/google/android/gms/internal/agz;->a(Lcom/google/android/gms/clearcut/LogEventParcelable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lcom/google/android/gms/internal/agz$d;->a:Lcom/google/android/gms/clearcut/LogEventParcelable;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/aha;->a(Lcom/google/android/gms/internal/ahc;Lcom/google/android/gms/clearcut/LogEventParcelable;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "ClearcutLoggerApiImpl"

    const-string v2, "derived ClearcutLogger.MessageProducer "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xa

    const-string v2, "MessageProducer"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/agz$d;->c(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agz$d;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/agz$d;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/agz$d;

    iget-object v0, p0, Lcom/google/android/gms/internal/agz$d;->a:Lcom/google/android/gms/clearcut/LogEventParcelable;

    iget-object v1, p1, Lcom/google/android/gms/internal/agz$d;->a:Lcom/google/android/gms/clearcut/LogEventParcelable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/clearcut/LogEventParcelable;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/agz$d;->a:Lcom/google/android/gms/clearcut/LogEventParcelable;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xc

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "MethodImpl("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
