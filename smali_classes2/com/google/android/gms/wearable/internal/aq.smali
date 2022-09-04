.class final Lcom/google/android/gms/wearable/internal/aq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/internal/aq$b;,
        Lcom/google/android/gms/wearable/internal/aq$o;,
        Lcom/google/android/gms/wearable/internal/aq$s;,
        Lcom/google/android/gms/wearable/internal/aq$a;,
        Lcom/google/android/gms/wearable/internal/aq$f;,
        Lcom/google/android/gms/wearable/internal/aq$g;,
        Lcom/google/android/gms/wearable/internal/aq$r;,
        Lcom/google/android/gms/wearable/internal/aq$u;,
        Lcom/google/android/gms/wearable/internal/aq$i;,
        Lcom/google/android/gms/wearable/internal/aq$h;,
        Lcom/google/android/gms/wearable/internal/aq$d;,
        Lcom/google/android/gms/wearable/internal/aq$c;,
        Lcom/google/android/gms/wearable/internal/aq$p;,
        Lcom/google/android/gms/wearable/internal/aq$t;,
        Lcom/google/android/gms/wearable/internal/aq$q;,
        Lcom/google/android/gms/wearable/internal/aq$n;,
        Lcom/google/android/gms/wearable/internal/aq$m;,
        Lcom/google/android/gms/wearable/internal/aq$l;,
        Lcom/google/android/gms/wearable/internal/aq$k;,
        Lcom/google/android/gms/wearable/internal/aq$j;,
        Lcom/google/android/gms/wearable/internal/aq$e;
    }
.end annotation


# direct methods
.method static synthetic a(Ljava/util/List;)Ljava/util/Map;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/wearable/internal/aq;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/wearable/b;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/internal/CapabilityInfoParcelable;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/wearable/internal/bb$c;

    invoke-direct {v4, v0}, Lcom/google/android/gms/wearable/internal/bb$c;-><init>(Lcom/google/android/gms/wearable/b;)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method
