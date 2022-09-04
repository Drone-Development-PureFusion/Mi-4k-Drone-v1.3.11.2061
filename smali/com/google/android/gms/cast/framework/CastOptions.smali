.class public Lcom/google/android/gms/cast/framework/CastOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/CastOptions$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/framework/CastOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Z

.field private final e:Lcom/google/android/gms/cast/LaunchOptions;

.field private final f:Z

.field private final g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

.field private final h:Z

.field private final i:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/framework/o;

    invoke-direct {v0}, Lcom/google/android/gms/cast/framework/o;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/framework/CastOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/util/List;ZLcom/google/android/gms/cast/LaunchOptions;ZLcom/google/android/gms/cast/framework/media/CastMediaOptions;ZD)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/google/android/gms/cast/LaunchOptions;",
            "Z",
            "Lcom/google/android/gms/cast/framework/media/CastMediaOptions;",
            "ZD)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/framework/CastOptions;->a:I

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, ""

    :cond_0
    iput-object p2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->b:Ljava/lang/String;

    if-nez p3, :cond_3

    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    iput-boolean p4, p0, Lcom/google/android/gms/cast/framework/CastOptions;->d:Z

    if-nez p5, :cond_2

    new-instance p5, Lcom/google/android/gms/cast/LaunchOptions;

    invoke-direct {p5}, Lcom/google/android/gms/cast/LaunchOptions;-><init>()V

    :cond_2
    iput-object p5, p0, Lcom/google/android/gms/cast/framework/CastOptions;->e:Lcom/google/android/gms/cast/LaunchOptions;

    iput-boolean p6, p0, Lcom/google/android/gms/cast/framework/CastOptions;->f:Z

    iput-object p7, p0, Lcom/google/android/gms/cast/framework/CastOptions;->g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    iput-boolean p8, p0, Lcom/google/android/gms/cast/framework/CastOptions;->h:Z

    iput-wide p9, p0, Lcom/google/android/gms/cast/framework/CastOptions;->i:D

    return-void

    :cond_3
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->d:Z

    return v0
.end method

.method public e()Lcom/google/android/gms/cast/LaunchOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->e:Lcom/google/android/gms/cast/LaunchOptions;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, p0, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/cast/framework/CastOptions;

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/cast/framework/CastOptions;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/CastOptions;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->d:Z

    iget-boolean v3, p1, Lcom/google/android/gms/cast/framework/CastOptions;->d:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->e:Lcom/google/android/gms/cast/LaunchOptions;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/CastOptions;->e:Lcom/google/android/gms/cast/LaunchOptions;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->f:Z

    iget-boolean v3, p1, Lcom/google/android/gms/cast/framework/CastOptions;->f:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    iget-object v3, p1, Lcom/google/android/gms/cast/framework/CastOptions;->g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->h:Z

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/CastOptions;->h()Z

    move-result v3

    if-ne v2, v3, :cond_3

    iget-wide v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->i:D

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/CastOptions;->i()D

    move-result-wide v4

    cmpl-double v2, v2, v4

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->f:Z

    return v0
.end method

.method public g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->h:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->e:Lcom/google/android/gms/cast/LaunchOptions;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->f:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-wide v2, p0, Lcom/google/android/gms/cast/framework/CastOptions;->i:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/framework/CastOptions;->i:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CastOptions("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "receiverApplicationId=%s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->b:Ljava/lang/String;

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "supportedNamespaces=%s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->c:Ljava/util/List;

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stopReceiverApplicationWhenEndingSession=%b"

    new-array v2, v5, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->d:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "launchOptions=%s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->e:Lcom/google/android/gms/cast/LaunchOptions;

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "resumeSavedSession=%s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->f:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "castMediaOptions=%s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->g:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "enableReconnectionService=%s"

    new-array v2, v5, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/google/android/gms/cast/framework/CastOptions;->h:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/framework/o;->a(Lcom/google/android/gms/cast/framework/CastOptions;Landroid/os/Parcel;I)V

    return-void
.end method
