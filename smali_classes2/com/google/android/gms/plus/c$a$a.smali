.class public final Lcom/google/android/gms/plus/c$a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/plus/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/plus/c$a$a;->b:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/android/gms/plus/c$a$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/plus/c$a$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public varargs a([Ljava/lang/String;)Lcom/google/android/gms/plus/c$a$a;
    .locals 3

    const-string v0, "activityTypes may not be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/plus/c$a$a;->b:Ljava/util/Set;

    aget-object v2, p1, v0

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public a()Lcom/google/android/gms/plus/c$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/plus/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/plus/c$a;-><init>(Lcom/google/android/gms/plus/c$a$a;Lcom/google/android/gms/plus/c$1;)V

    return-object v0
.end method
