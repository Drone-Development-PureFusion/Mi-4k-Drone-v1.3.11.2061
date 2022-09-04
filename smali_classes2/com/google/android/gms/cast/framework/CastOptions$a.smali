.class public final Lcom/google/android/gms/cast/framework/CastOptions$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/CastOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Lcom/google/android/gms/cast/LaunchOptions;

.field private e:Z

.field private f:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

.field private g:Z

.field private h:D


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->b:Ljava/util/List;

    new-instance v0, Lcom/google/android/gms/cast/LaunchOptions;

    invoke-direct {v0}, Lcom/google/android/gms/cast/LaunchOptions;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->d:Lcom/google/android/gms/cast/LaunchOptions;

    iput-boolean v1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->e:Z

    new-instance v0, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;

    invoke-direct {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions$a;->a()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->f:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    iput-boolean v1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->g:Z

    const-wide v0, 0x3fa99999a0000000L    # 0.05000000074505806

    iput-wide v0, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->h:D

    return-void
.end method


# virtual methods
.method public a(D)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-lez v0, :cond_0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "volumeDelta must be greater than 0 and less or equal to 0.5"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-wide p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->h:D

    return-object p0
.end method

.method public a(Lcom/google/android/gms/cast/LaunchOptions;)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->d:Lcom/google/android/gms/cast/LaunchOptions;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/CastMediaOptions;)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->f:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/cast/framework/CastOptions$a;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->b:Ljava/util/List;

    return-object p0
.end method

.method public a(Z)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->c:Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/cast/framework/CastOptions;
    .locals 12

    new-instance v1, Lcom/google/android/gms/cast/framework/CastOptions;

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->b:Ljava/util/List;

    iget-boolean v5, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->c:Z

    iget-object v6, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->d:Lcom/google/android/gms/cast/LaunchOptions;

    iget-boolean v7, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->e:Z

    iget-object v8, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->f:Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    iget-boolean v9, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->g:Z

    iget-wide v10, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->h:D

    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/cast/framework/CastOptions;-><init>(ILjava/lang/String;Ljava/util/List;ZLcom/google/android/gms/cast/LaunchOptions;ZLcom/google/android/gms/cast/framework/media/CastMediaOptions;ZD)V

    return-object v1
.end method

.method public b(Z)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->e:Z

    return-object p0
.end method

.method public c(Z)Lcom/google/android/gms/cast/framework/CastOptions$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/cast/framework/CastOptions$a;->g:Z

    return-object p0
.end method
