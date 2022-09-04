.class final Lcom/google/android/gms/internal/agm$e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/a/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;JLorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$e;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/agm$e;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/agm$e;->c:J

    iput-object p5, p0, Lcom/google/android/gms/internal/agm$e;->d:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$e;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/agm$e;->c:J

    return-wide v0
.end method

.method public d()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$e;->d:Lorg/json/JSONObject;

    return-object v0
.end method
