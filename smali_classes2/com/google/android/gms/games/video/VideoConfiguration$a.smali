.class public final Lcom/google/android/gms/games/video/VideoConfiguration$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/video/VideoConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->a:I

    iput p2, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->c:Z

    iput-object v1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->d:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->e:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->f:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/games/video/VideoConfiguration$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->a:I

    return-object p0
.end method

.method public a()Lcom/google/android/gms/games/video/VideoConfiguration;
    .locals 9

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/games/video/VideoConfiguration;

    iget v1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->a:I

    iget v2, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->b:I

    iget-boolean v7, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->c:Z

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v8, v3

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/games/video/VideoConfiguration;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/games/video/VideoConfiguration$1;)V

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/games/video/VideoConfiguration$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/games/video/VideoConfiguration$a;->b:I

    return-object p0
.end method
